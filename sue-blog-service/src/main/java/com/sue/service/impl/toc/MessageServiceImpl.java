package com.sue.service.impl.toc;

import com.sue.mapper.MessageMapper;
import com.sue.model.entity.Message;
import com.sue.model.vo.MessageVO;
import com.sue.service.toc.MessageService;
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
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<MessageVO> queryMessages() {
        Example example = new Example(Message.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isShow",1);
        example.orderBy("createdTime").desc();
        List<Message> messages = messageMapper.selectByExample(example);

        List<MessageVO> collect = messages.stream().map(m -> {
            MessageVO messageVO = new MessageVO();
            BeanUtils.copyProperties(m, messageVO);
            return messageVO;
        }).collect(Collectors.toList());

        return collect;
    }
}
