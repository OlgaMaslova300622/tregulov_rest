package org.example.exception_handing;

public class NoSuchEmployeeException extends RuntimeException {


    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
