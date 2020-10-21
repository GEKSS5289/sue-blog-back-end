package com.sue.common.utils;

import com.sue.common.enums.ErrorEnums;
import com.sue.common.exception.BaseException;

/**
 * @author sue
 * @date 2020/10/21 21:13
 */

/**
 * 异常执行器
 */
public class ExceptionUtil {
    public static void throwException(ErrorEnums errorEnums){
        throw new BaseException(errorEnums);
    }
}
