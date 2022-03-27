package com.project.staybooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @Description
 * @date
 */

@ControllerAdvice //make Spring use CustomExceptionHandler when there’s any exceptions in the Controller code.
public class CustomExceptionHandler {//service throws UserAlreadyExistException.class, catch到了，返回下面类型

    @ExceptionHandler(UserAlreadyExistException.class)//@ExceptionHandler to match each exception to the corresponding
    // handler function
    public final ResponseEntity<String> handleUserAlreadyExistExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}