package com.sue.service.impl.admin;

import com.sue.common.enums.ErrorEnums;
import com.sue.mapper.CategoryMapper;
import com.sue.model.dto.CategoryDTO;
import com.sue.model.entity.Category;
import com.sue.model.vo.CategoryVO;
import com.sue.service.admin.CategoryMngService;

import com.sue.support.exception.assist.ExceptionPerformer;
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

        this.checkExist(categoryDTO.getCategoryName());
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO,category);
        categoryMapper.insert(category);

    }



    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateCategory(Integer categoryId, CategoryDTO categoryDTO) {

        this.updateCheckExist(categoryId,categoryDTO);
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",categoryId);
        Category category = new Category();
        category.setId(categoryId);
        BeanUtils.copyProperties(categoryDTO,category);
        categoryMapper.updateByExampleSelective(category, example);

    }

    @Override
    public CategoryVO queryCategoryById(Integer categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        Category category1 = categoryMapper.selectByPrimaryKey(category);
        if(category1 == null) ExceptionPerformer.Execute(ErrorEnums.NOT_FOUND_CATEGORY);
        CategoryVO categoryVO = new CategoryVO();
        BeanUtils.copyProperties(category1,categoryVO);
        return categoryVO;
    }



    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteCateogoryById(Integer categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        categoryMapper.delete(category);
    }




    private void checkExist(String categoryName){
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryName",categoryName);
        Category category1 = categoryMapper.selectOneByExample(example);
        if(category1!=null){
            if(category1.getCategoryName().equals(categoryName)){
                ExceptionPerformer.Execute(ErrorEnums.CATEGORY_EXIST);
            }
        }

    }



    private void updateCheckExist(Integer categoryId,CategoryDTO categoryDTO){

        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",categoryId);
        Category category = categoryMapper.selectOneByExample(example);

        Example example1 = new Example(Category.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("categoryName",categoryDTO.getCategoryName());
        Category category1 = categoryMapper.selectOneByExample(example1);


        //TODO:后期优化
        if(categoryDTO.getCategoryName().equals(category.getCategoryName())){
            return;
        }else if(category1!=null){
            ExceptionPerformer.Execute(ErrorEnums.CATEGORY_EXIST);
        }else{
            return;
        }

    }
}
