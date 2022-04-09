package com.project.staybooking.exception;

/**
 * @Description
 * @date
 */
public class InvalidReservationDateException extends RuntimeException {
    public InvalidReservationDateException(String message) {
        super(message);
    }
}