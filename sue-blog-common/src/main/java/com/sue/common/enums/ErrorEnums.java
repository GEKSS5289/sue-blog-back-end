package com.sue.common.enums;

/**
 * @author sue
 * @date 2020/10/21 21:07
 */

/**
 * 错误枚举
 */
public enum  ErrorEnums {


    //当readme为空时的错误
    READEME_NULL(1,"自述为空");

    private Integer code;
    private String msg;

    ErrorEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
