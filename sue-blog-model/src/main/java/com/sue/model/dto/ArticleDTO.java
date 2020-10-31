package com.sue.model.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sue
 * @date 2020/10/31 18:01
 */

@Data
public class ArticleDTO {

    /**
     * 文章标题
     */
    @NotBlank(message = "文章标题不能为空")
    private String title;

    /**
     * 文章内容
     */
    @NotBlank(message = "文章内容不能为空")
    private String content;


    /**
     * 文章分类id
     */
    @NotNull(message = "文章分类不能为空")
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 作者id
     */

    @Column(name = "author_id")
    @NotNull(message = "作者id不能为空")
    private Integer authorId;

}
