package com.sue.service.impl.toc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sue.common.enums.ShowOrHide;
import com.sue.mapper.DynamicMapper;
import com.sue.mapper.MessageMapper;
import com.sue.model.dto.DynamicDTO;
import com.sue.model.dto.MessageDTO;
import com.sue.model.entity.Dynamic;
import com.sue.model.entity.Message;
import com.sue.model.vo.toc.MessageVO;
import com.sue.service.toc.IndexService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/10/8 21:06
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Dynamic> queryDynamic() {
        //TODO:分页查询
        PageHelper.startPage(1,5);
        Example example = new Example(Dynamic.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createdTime").desc();
        criteria.andEqualTo("isShow",true);
        List<Dynamic> dynamics = dynamicMapper.selectByExample(example);
        PageInfo<?> pageInfo = new PageInfo<>(dynamics);
        return dynamics;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void createMessage(MessageDTO messageDTO) {
        Message message = new Message();
        BeanUtils.copyProperties(messageDTO,message);
        message.setCreatedTime(new Date());
        message.setIsShow(ShowOrHide.HIDE.getCode());
        messageMapper.insert(message);
    }




}
