package com.sue.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sue
 * @date 2020/11/13 19:23
 */

@Data
public class CommentDTO {
    @NotBlank(message = "评论内容不能为空")
    private String commentContent;
    @NotNull(message = "文章Id不能为空")
    private Integer articleId;
}
