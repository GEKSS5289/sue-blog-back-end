package com.sue.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author sue
 * @date 2020/11/11 19:24
 */

@Data
public class MessageDTO {
    @NotBlank(message = "内容不能为空")
    private String content;
}
