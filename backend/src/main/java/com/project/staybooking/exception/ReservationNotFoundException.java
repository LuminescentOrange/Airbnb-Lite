package com.project.staybooking.exception;

/**
 * @Description
 * @date
 */
public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(String message) {
        super(message);
    }
}

