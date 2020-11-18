package com.sue.common.enums;

import lombok.Getter;

/**
 * @author sue
 * @date 2020/11/11 19:29
 */

@Getter
public enum FileStatusEnums {

    PROVIDE(true,"提供"),
    NOT_PROVIDE(false,"不提供");

    private Boolean code;
    private String msg;

    FileStatusEnums(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
