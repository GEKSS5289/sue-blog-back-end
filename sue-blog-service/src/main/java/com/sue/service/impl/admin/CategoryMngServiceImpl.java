package com.sue.service.impl.admin;

import com.sue.mapper.CategoryMapper;
import com.sue.model.dto.CategoryDTO;
import com.sue.model.entity.Category;
import com.sue.model.vo.admin.CategoryVO;
import com.sue.service.admin.CategoryMngService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/11/5 20:04
 */
@Service
public class CategoryMngServiceImpl implements CategoryMngService {

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



    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void createCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO,category);
        categoryMapper.insert(category);
    }



    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateCategoryName(Integer categoryId, CategoryDTO categoryDTO) {

        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",categoryId);
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO,category);
        categoryMapper.updateByExampleSelective(category,example);
    }

    @Override
    public CategoryVO querycategoryById(Integer categoryId) {

        Category category = new Category();
        category.setId(categoryId);
        Category category1 = categoryMapper.selectByPrimaryKey(category);
        CategoryVO categoryVO = new CategoryVO();
        BeanUtils.copyProperties(category1,categoryVO);
        return categoryVO;


    }
}
