package com.sue.common.enums;

import lombok.Getter;

/**
 * @author sue
 * @date 2020/11/11 19:29
 */

@Getter
public enum ExistEnums {

    DEL(true,"删除"),
    NOT_DEL(false,"没删除");

    private Boolean code;
    private String msg;

    ExistEnums(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
