package com.sue.model.vo.admin;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author sue
 * @date 2020/11/5 20:07
 */


@Data
public class CategoryVO {

    private Integer id;
    private String categoryName;
    private String categoryImg;
}
