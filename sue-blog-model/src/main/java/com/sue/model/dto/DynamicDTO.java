package com.sue.model.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sue
 * @date 2020/11/1 17:11
 */
@Data
public class DynamicDTO {

    @NotBlank(message = "动态内容不能为空")
    private String content;
    private String dyImg;
    private String dyVideo;
    @NotNull(message = "动态发布者不能为空")
    private Integer uid;
    @NotBlank(message = "心情不能为空")
    private String mood;

}
