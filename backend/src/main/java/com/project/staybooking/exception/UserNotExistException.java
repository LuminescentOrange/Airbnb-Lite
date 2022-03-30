package com.project.staybooking.exception;

/**
 * @Description
 * @date
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String message) {
        super(message);
    }
}
