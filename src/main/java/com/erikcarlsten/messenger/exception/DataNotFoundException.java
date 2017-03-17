package com.erikcarlsten.messenger.exception;

public class DataNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -8637561875201989824L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
