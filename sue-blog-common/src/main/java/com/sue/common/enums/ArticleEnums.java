package com.sue.common.enums;

import lombok.Getter;

/**
 * @author sue
 * @date 2020/10/31 18:12
 */


@Getter
public enum ArticleEnums {

    //文章状态

    NO_SHOW(0,"不显示"),
    SHOW(1,"显示");

    private Integer code;
    private String desc;

    ArticleEnums(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
