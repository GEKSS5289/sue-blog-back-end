package com.sue.model.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

/**
 * @author sue
 * @date 2020/11/5 20:13
 */

@Data
public class CategoryDTO {

    @NotBlank(message = "分类名称不能为空")
    private String categoryName;

    @NotBlank(message = "分类图标不能为空")
    private String categoryImg;
}
