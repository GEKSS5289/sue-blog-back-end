package com.sue.service.impl.toc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sue.mapper.DynamicMapper;
import com.sue.model.entity.Dynamic;
import com.sue.service.toc.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/8 21:06
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public List<Dynamic> queryDynamic() {
        //TODO:分页查询
        PageHelper.startPage(1,5);
        List<Dynamic> dynamics = dynamicMapper.selectAll();
        PageInfo<?> pageInfo = new PageInfo<>(dynamics);
        System.out.println("ss");
        return dynamics;
    }
}
