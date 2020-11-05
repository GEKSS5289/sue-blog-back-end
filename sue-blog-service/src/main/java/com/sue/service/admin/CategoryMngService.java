package com.sue.service.admin;

import com.sue.model.dto.CategoryDTO;
import com.sue.model.vo.admin.CategoryVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/5 20:03
 */

public interface CategoryMngService {

    List<CategoryVO> queryCategoryList();

    void createCategory(CategoryDTO categoryDTO);

    void updateCategoryName(Integer categoryId, CategoryDTO categoryDTO);

    CategoryVO querycategoryById(Integer categoryId);
}
