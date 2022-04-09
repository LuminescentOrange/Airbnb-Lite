package com.project.staybooking.exception;

/**
 * @Description
 * @date
 */
public class ReservationCollisionException extends RuntimeException {
    public ReservationCollisionException(String message) {
        super(message);
    }
}
