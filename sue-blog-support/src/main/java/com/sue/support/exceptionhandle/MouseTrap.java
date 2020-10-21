package com.sue.support.exceptionhandle;

import com.sue.common.exception.BaseException;
import com.sue.support.response.ResponseContainer;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @author sue
 * @date 2020/10/21 21:23
 */
@RestControllerAdvice
public class MouseTrap {

    @ExceptionHandler(BaseException.class)
    public ResponseContainer BaseExceptionHandle(BaseException e, HttpServletResponse response){

        response.setStatus(400);

        return ResponseContainer.bad(e.getMessage());

    }

}
