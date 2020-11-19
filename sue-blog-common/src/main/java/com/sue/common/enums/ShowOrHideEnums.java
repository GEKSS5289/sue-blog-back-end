package com.sue.common.enums;

import lombok.Getter;

/**
 * @author sue
 * @date 2020/11/11 19:29
 */

@Getter
public enum ShowOrHideEnums {

    SHOW(true,"显示留言"),
    HIDE(false,"不显示留言");

    private Boolean code;
    private String msg;

    ShowOrHideEnums(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
