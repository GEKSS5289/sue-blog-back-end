package com.sue.support.exception;

import com.sue.common.enums.ErrorEnums;

/**
 * @author sue
 * @date 2020/10/21 21:14
 */

public class BaseException extends RuntimeException {
    private ErrorEnums errorEnums;
    public BaseException(ErrorEnums errorEnums) {
        super(errorEnums.getMsg());
        this.errorEnums = errorEnums;
    }
}
