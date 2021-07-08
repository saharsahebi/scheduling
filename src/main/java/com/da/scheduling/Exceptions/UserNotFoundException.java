package com.da.scheduling.Exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(int id){
        super("user not found by id :"+ id);
    }
}
