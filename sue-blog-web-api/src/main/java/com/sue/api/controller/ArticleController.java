package com.sue.api.controller;

import com.sue.model.vo.toc.ArticleContentVO;
import com.sue.model.vo.toc.ArticleDescVO;
import com.sue.service.toc.ArticleService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author sue
 * @date 2020/10/31 19:23
 */

@RestController
@RequestMapping("blog")
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    @GetMapping("article")
    public ResponseContainer queryArticleDescList(){
        List<ArticleDescVO> articleDescVOS = articleService.queryArticleDesc();
        return ResponseContainer.ideality(articleDescVOS);
    }


    @GetMapping("article/{id}")
    public ResponseContainer queryArticleById(@PathVariable @Valid @NotNull(message = "文章id不能为空") Integer id){
        ArticleContentVO articleContentVO = articleService.queryArticleById(id);
        return ResponseContainer.ideality(articleContentVO);
    }
}
