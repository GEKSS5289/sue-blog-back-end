package com.sue.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author sue
 * @date 2020/11/11 20:03
 */

@Data
public class MessageMngVO {
    private Integer id;
    private String content;
    private Date createdTime;
}
