package com.sue.api.controller;

import com.sue.model.dto.CommentDTO;
import com.sue.model.vo.CommentVO;
import com.sue.service.toc.CommentService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author sue
 * @date 2020/11/17 20:06
 */
@RestController
@RequestMapping("blog")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("comment")
    public ResponseContainer writeArticleComment(@RequestBody @Valid CommentDTO commentDTO){

        commentService.saveComment(commentDTO);
        return ResponseContainer.ideality();
    }


    @GetMapping("comment/{articleId}")
    public ResponseContainer queryCommentByArticleId(@PathVariable @Valid @NotNull(message = "文章ID不能为空")Integer articleId){
        List<CommentVO> commentVOS = commentService.queryCommentByArticleId(articleId);
        return ResponseContainer.ideality(commentVOS);
    }

}
