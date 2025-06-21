package com.ryder.microserviceclient.exception;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(String message){
        super(message);
    }
}