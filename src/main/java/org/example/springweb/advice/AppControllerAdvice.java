package org.example.springweb.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppControllerAdvice {
    @ExceptionHandler
    public String handleException(Exception ex) {
        ex.printStackTrace();
        return "error/500";
    }

    @ExceptionHandler
    public String handleException2(Exception ex) {
        return "error/app";
    }
}
