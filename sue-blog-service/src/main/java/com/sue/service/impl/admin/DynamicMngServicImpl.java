package com.sue.service.impl.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sue.mapper.DynamicMapper;
import com.sue.model.dto.DynamicDTO;
import com.sue.model.entity.Dynamic;
import com.sue.service.admin.DynamicMngServic;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @author sue
 * @date 2020/11/1 18:32
 */

@Service
public class DynamicMngServicImpl implements DynamicMngServic {


    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public List<Dynamic> queryDynamic() {

            //TODO:分页查询
//            PageHelper.startPage(1,5);
            Example example = new Example(Dynamic.class);
            Example.Criteria criteria = example.createCriteria();
            example.orderBy("createdTime").desc();
            criteria.andEqualTo("isShow",true);
            List<Dynamic> dynamics = dynamicMapper.selectByExample(example);
//            PageInfo<?> pageInfo = new PageInfo<>(dynamics);

            return dynamics;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveDyNamic(DynamicDTO dynamicDTO) {

        Date date = new Date();
        Dynamic dynamic = new Dynamic();
        BeanUtils.copyProperties(dynamicDTO,dynamic);
        dynamic.setIsShow(true);
        dynamic.setCreatedTime(date);
        dynamic.setUpdatedTime(date);

        dynamicMapper.insert(dynamic);

    }

    @Override
    public void deleteDyNamic(Integer dynamicId) {
        Dynamic dynamic = new Dynamic();
        dynamic.setId(dynamicId);
        dynamicMapper.delete(dynamic);
    }
}
