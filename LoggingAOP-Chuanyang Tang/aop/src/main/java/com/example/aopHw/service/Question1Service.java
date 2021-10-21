package com.example.aopHw.service;

import com.example.aopHw.dao.Question1DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Question1Service {

    @Autowired
    private Question1DAO question1DAO;

    public String question1(){
        return question1DAO.question1();
    }
}
