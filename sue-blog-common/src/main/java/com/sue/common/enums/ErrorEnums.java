package com.sue.common.enums;

import lombok.Getter;

/**
 * @author sue
 * @date 2020/11/11 10:45
 */

@Getter
public enum  ErrorEnums {

    CATEGORY_EXIST(1001,"该分类已经存在"),
    CATEGORY_NOT_CHANGE(1002,"你并没有改变分类"),
    NOT_FOUND_CATEGORY(1003,"不存在的分类"),



    NOT_FOUND_RESOURCE(2001,"不存在的资源"),
    TOKEN_FAILURE(2002,"token失效"),
    TOKEN_ERROR(2003,"token出错"),
    NOT_TOKEN(2004,"token不存在");


    private Integer code;
    private String msg;

    ErrorEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
