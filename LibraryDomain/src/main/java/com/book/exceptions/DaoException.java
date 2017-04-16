package com.book.exceptions;


public class DaoException extends Exception {
    private long code;

    public DaoException(String message, long code) {
        super(message);
        this.code = code;
    }

    public long getCode() {
        return code;
    }
}
