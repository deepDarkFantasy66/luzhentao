package com.example.exception;

import com.example.utils.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Results exceptionHandler(Exception e) {
        log.error("全局异常捕获:{}", e.getMessage());
        return new Results(false, null, e.getMessage());
    }
}
