package com.project.staybooking.exception;

/**
 * @Description
 * @date
 */
public class UserAlreadyExistException extends RuntimeException { // service.RegisterService
    public UserAlreadyExistException(String message) {
        super(message);
    }
}