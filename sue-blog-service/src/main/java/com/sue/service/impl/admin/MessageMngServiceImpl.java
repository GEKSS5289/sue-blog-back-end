package com.sue.service.impl.admin;

import com.sue.common.enums.ErrorEnums;
import com.sue.common.enums.ShowOrHide;
import com.sue.mapper.MessageMapper;
import com.sue.model.entity.Message;
import com.sue.model.vo.MessageMngVO;
import com.sue.service.admin.MessageMngService;
import com.sue.support.exception.assist.ExceptionPerformer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/11/13 10:30
 */
@Service
public class MessageMngServiceImpl implements MessageMngService {

    @Autowired
    private MessageMapper messageMapper;


    @Override
    public List<MessageMngVO> queryNotCheckMessages() {

        Example example = new Example(Message.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isShow",ShowOrHide.HIDE.getCode());
        List<Message> messages = messageMapper.selectByExample(example);

        List<MessageMngVO> collect = messages.stream().map(m -> {
            MessageMngVO messageMngVO = new MessageMngVO();
            BeanUtils.copyProperties(m, messageMngVO);
            return messageMngVO;
        }).collect(Collectors.toList());

        return collect;
    }

    @Override
    public List<MessageMngVO> queryPassMessage() {
        Example example = new Example(Message.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createdTime").desc();
        criteria.andEqualTo("isShow",ShowOrHide.SHOW.getCode());

        List<Message> messages = messageMapper.selectByExample(example);
        if(messages.isEmpty()) {
            ExceptionPerformer.Execute(ErrorEnums.NOT_FOUND_RESOURCE);
        }
        List<MessageMngVO> collect = messages.stream().map(m -> {
            MessageMngVO messageMngVO = new MessageMngVO();
            BeanUtils.copyProperties(m, messageMngVO);
            return messageMngVO;
        }).collect(Collectors.toList());

        return collect;
    }


    @Override
    public void passMessage(Integer messageId) {
        Message message = new Message();
        message.setId(messageId);
        message.setIsShow(ShowOrHide.SHOW.getCode());
        messageMapper.updateByPrimaryKeySelective(message);
    }

    @Override
    public void failMessage(Integer messageId) {
        Message message = new Message();
        message.setId(messageId);
        message.setIsShow(ShowOrHide.HIDE.getCode());
        messageMapper.updateByPrimaryKeySelective(message);
    }

    @Override
    public void deleteMessage(Integer messageId) {
        Message message = new Message();
        message.setId(messageId);
        messageMapper.delete(message);
    }
}
