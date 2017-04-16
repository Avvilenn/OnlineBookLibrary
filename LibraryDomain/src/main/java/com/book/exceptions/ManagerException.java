package com.book.exceptions;


public class ManagerException extends Exception {
    private long code;

    public ManagerException(String message) {
        super(message);
    }

    public long getCode() {
        return code;
    }
}
