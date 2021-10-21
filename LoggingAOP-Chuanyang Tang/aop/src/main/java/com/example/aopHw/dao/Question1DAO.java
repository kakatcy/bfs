package com.example.aopHw.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Question1DAO {
    public String question1(){
        try{
            System.out.println("-----Executing DAO Layer-----");
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Data";
    }
}
