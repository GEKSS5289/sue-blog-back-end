package com.sue.model.vo;

import com.sue.model.entity.Comment;
import lombok.Data;


import java.util.Date;

/**
 * @author sue
 * @date 2020/11/17 20:36
 */
@Data
public class CommentVO {

    private String commentContent;
    private Date createdTime;


    public CommentVO(Comment comment){
        this.commentContent = comment.getCommentContent();
        this.createdTime = comment.getCreatedTime();
    }
}
