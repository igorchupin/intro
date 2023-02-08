package org.example.exceptions;

public class MyException extends RuntimeException{
    @Override
    public String getLocalizedMessage() {
        return "MyException";
    }
}
