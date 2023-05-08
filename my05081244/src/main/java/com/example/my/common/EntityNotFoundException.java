package com.example.my.common;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(){

    }

    public EntityNotFoundException(String message){
        super(message);
    }
}
