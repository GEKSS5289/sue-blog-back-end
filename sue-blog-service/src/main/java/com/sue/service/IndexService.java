package com.sue.service;

import com.sue.model.entity.Dynamic;
import com.sue.model.entity.Readme;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/8 20:34
 */


public interface IndexService {
    public List<Dynamic> queryDynamic();
    public Readme queryOneReadMe();
}
