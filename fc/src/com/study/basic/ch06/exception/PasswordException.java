package com.study.basic.ch06.exception;

public class PasswordException extends IllegalArgumentException{

    public PasswordException(String message) {
        super(message);
    }

}
