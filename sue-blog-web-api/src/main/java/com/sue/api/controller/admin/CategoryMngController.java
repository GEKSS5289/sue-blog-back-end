package com.sue.api.controller.admin;

import com.sue.model.dto.CategoryDTO;
import com.sue.model.vo.admin.CategoryVO;
import com.sue.service.admin.CategoryMngService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author sue
 * @date 2020/11/5 20:02
 */
@RestController
@RequestMapping("admin")
public class CategoryMngController {


    @Autowired
    private CategoryMngService categoryMngService;

    @GetMapping("category")
    public ResponseContainer queryCategoryList(){
        List<CategoryVO> categoryVOS =  categoryMngService.queryCategoryList();
        return ResponseContainer.ideality(categoryVOS);
    }



    @PostMapping("category")
    public ResponseContainer createNewCategory(@RequestBody @Valid CategoryDTO categoryDTO){
        categoryMngService.createCategory(categoryDTO);
        return ResponseContainer.ideality();
    }



    @PutMapping("category/{categoryId}")
    public ResponseContainer updateCategoryName(
            @PathVariable
            @Valid
            @NotBlank(message = "分类ID不能为空") Integer categoryId,
            @RequestBody CategoryDTO categoryDTO
    ){
        categoryMngService.updateCategory(categoryId,categoryDTO);
        return ResponseContainer.ideality();
    }



    @GetMapping("category/{categoryId}")
    public ResponseContainer queryCategoryById(
            @PathVariable
            @Valid
            @NotNull(message = "分类ID不能为空") Integer categoryId){

        CategoryVO categoryVO = categoryMngService.queryCategoryById(categoryId);
        return ResponseContainer.ideality(categoryVO);
    }


    @DeleteMapping("category/{categoryId}")
    public ResponseContainer deleteCategoryById(
            @PathVariable
            @Valid
            @NotNull(message = "分类ID不能为空")Integer categoryId
    ){
        categoryMngService.deleteCateogoryById(categoryId);
        return ResponseContainer.ideality();
    }
}
