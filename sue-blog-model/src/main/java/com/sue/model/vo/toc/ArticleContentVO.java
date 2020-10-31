package com.sue.model.vo.toc;

import lombok.Data;

import java.util.Date;

/**
 * @author sue
 * @date 2020/10/31 20:18
 */

@Data
public class ArticleContentVO {
    private Integer id;
    private String title;
    private Date createdTime;
    private String content;
    private Integer categoryId;
}
