package com.sue.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sue.common.enums.ErrorEnums;
import com.sue.common.utils.ExceptionUtil;
import com.sue.mapper.DynamicMapper;
import com.sue.mapper.ReadmeMapper;
import com.sue.model.entity.Dynamic;
import com.sue.model.entity.Readme;
import com.sue.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/8 21:06
 */

/**
 * 首页index业务层
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Autowired
    private ReadmeMapper readmeMapper;

    @Override
    public List<Dynamic> queryDynamic() {
        //TODO:分页查询
        PageHelper.startPage(1, 5);
        List<Dynamic> dynamics = dynamicMapper.selectAll();
        PageInfo<?> pageInfo = new PageInfo<>(dynamics);
        System.out.println("ss");
        return dynamics;
    }

    @Override
    public Readme queryOneReadMe() {
        List<Readme> readmes = readmeMapper.selectAll();
        Readme readme = null;
        if(readmes.size()!=0){
            readme = readmes.get(0);
        }else{
            ExceptionUtil.throwException(ErrorEnums.READEME_NULL);
        }
        return readme;
    }
}
