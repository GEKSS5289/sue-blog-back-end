package com.sue.support.exception;

import com.sue.common.enums.ErrorEnums;
import lombok.Data;

/**
 * @author sue
 * @date 2020/11/11 10:44
 */
@Data
public class ErrorclampException extends RuntimeException{
    private ErrorEnums errorEnums;

    public ErrorclampException(ErrorEnums errorEnums) {
        this.errorEnums = errorEnums;
    }

}
