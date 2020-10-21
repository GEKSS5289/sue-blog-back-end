package com.sue.common.exception;

import com.sue.common.enums.ErrorEnums;

/**
 * @author sue
 * @date 2020/10/21 21:14
 */

/**
 * 自定义异常
 */
public class BaseException extends RuntimeException {
    private ErrorEnums errorEnums;
    public BaseException(ErrorEnums errorEnums) {
        super(errorEnums.getMsg());
        this.errorEnums = errorEnums;
    }

    public ErrorEnums getErrorEnums() {
        return errorEnums;
    }

    public void setErrorEnums(ErrorEnums errorEnums) {
        this.errorEnums = errorEnums;
    }
}
