package com.sue.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sue
 * @date 2020/11/2 14:26
 */

@Data
public class DynamicUpdateDTO {
    @NotBlank(message = "动态内容不能为空")
    private String content;
    @NotBlank(message = "心情不能为空")
    private String mood;
}
