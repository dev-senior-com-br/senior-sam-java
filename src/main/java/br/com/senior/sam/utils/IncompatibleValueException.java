package br.com.senior.sam.utils;

public class IncompatibleValueException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IncompatibleValueException(String message) {
        super(message);
    }

    public IncompatibleValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
