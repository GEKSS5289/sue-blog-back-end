package com.sue.api.controller;

import com.sue.model.dto.CommentDTO;
import com.sue.model.vo.ArticleContentVO;
import com.sue.model.vo.ArticleDescVO;
import com.sue.model.vo.CommentVO;
import com.sue.service.toc.ArticleService;
import com.sue.service.toc.CommentService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private CommentService commentService;

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

//    @PostMapping("article/comment")
//    public ResponseContainer writeArticleComment(@RequestBody CommentDTO commentDTO){
//
//        return null;
//
//    }



    @PostMapping("article/comment")
    public ResponseContainer writeArticleComment(@RequestBody @Valid CommentDTO commentDTO){

        commentService.saveComment(commentDTO);
        return ResponseContainer.ideality();
    }


    @GetMapping("article/comment/{articleId}")
    public ResponseContainer queryCommentByArticleId(@PathVariable @Valid @NotNull(message = "文章ID不能为空")Integer articleId){
        List<CommentVO> commentVOS = commentService.queryCommentByArticleId(articleId);
        return ResponseContainer.ideality(commentVOS);
    }
}
