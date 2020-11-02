package com.sue.support.exception.handle;

import com.sue.support.exception.assist.ErrorFilter;
import com.sue.support.response.ResponseContainer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sue
 * @date 2020/10/8 20:21
 */

@RestControllerAdvice
public class ExceptionHandle {



    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseContainer methodArgumentExceptionHandler(MethodArgumentNotValidException e){

        Map<String,String> errorMap = new HashMap<>();
        ErrorFilter.startFilter(errorMap,e);
        return ResponseContainer.bad(errorMap);

    }
}
