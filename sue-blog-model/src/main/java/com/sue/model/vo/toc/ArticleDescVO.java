package com.sue.model.vo.toc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author sue
 * @date 2020/10/31 19:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDescVO {
    private Integer id;
    private String title;
    private Date createdTime;
    private Integer commentCount;
    private Integer readCount;
    private String categoryName;
}
