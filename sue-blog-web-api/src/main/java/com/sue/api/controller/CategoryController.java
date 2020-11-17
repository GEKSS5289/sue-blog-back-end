package com.sue.api.controller;

import com.sue.model.vo.CategoryVO;
import com.sue.service.toc.CategoryService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/9 19:39
 */

@RestController
@RequestMapping("blog")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("category")
    public ResponseContainer queryCategoryList(){
        List<CategoryVO> categoryVOS =  categoryService.queryCategoryList();
        return ResponseContainer.ideality(categoryVOS);
    }

}
