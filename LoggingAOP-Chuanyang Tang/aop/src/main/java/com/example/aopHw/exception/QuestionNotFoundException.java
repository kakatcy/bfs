package com.example.aopHw.exception;

public class QuestionNotFoundException extends Exception{
    public QuestionNotFoundException(Integer id){
        super(id.toString());
    }
}
