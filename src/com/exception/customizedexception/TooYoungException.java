package com.exception.customizedexception;

public class TooYoungException extends RuntimeException {

    TooYoungException(String message) {
        super(message);
    }
}
