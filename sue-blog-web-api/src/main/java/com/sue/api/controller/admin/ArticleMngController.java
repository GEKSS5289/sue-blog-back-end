package com.sue.api.controller.admin;

import com.sue.model.dto.ArticleDTO;
import com.sue.model.vo.admin.ArticleMngDescVO;
import com.sue.service.admin.ArticleMngService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author sue
 * @date 2020/10/31 17:59
 */

@RestController
@RequestMapping("admin")
public class ArticleMngController {


    @Autowired
    private ArticleMngService articleMngService;

    @PostMapping("article")
    public ResponseContainer createArticle(@Valid @RequestBody ArticleDTO articleDTO){
            articleMngService.saveArticle(articleDTO);
            return ResponseContainer.ideality();
    }


    @GetMapping("article")
    public ResponseContainer queryArticleList(){
        List<ArticleMngDescVO> articleDescVOS = articleMngService.queryArticleDescList();
        return ResponseContainer.ideality(articleDescVOS);
    }

}