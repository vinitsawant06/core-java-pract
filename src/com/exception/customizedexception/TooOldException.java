package com.exception.customizedexception;

public class TooOldException extends RuntimeException {
    TooOldException(String message) {
        super(message);
    }
}
