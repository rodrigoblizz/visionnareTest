package com.visionnareTest1.visionnareTest1.services.exception;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
    public ObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
