package com.sue.service.impl.toc;

import com.sue.mapper.CategoryMapper;
import com.sue.model.entity.Category;
import com.sue.model.vo.CategoryVO;
import com.sue.service.toc.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/11/9 19:44
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<CategoryVO> queryCategoryList() {

        List<Category> categories = categoryMapper.selectAll();
        List<CategoryVO> collect = categories.stream().map(
                c -> {
                    CategoryVO categoryVO = new CategoryVO();
                    BeanUtils.copyProperties(c, categoryVO);
                    return categoryVO;
                }
        ).collect(Collectors.toList());
        return collect;

    }

}
