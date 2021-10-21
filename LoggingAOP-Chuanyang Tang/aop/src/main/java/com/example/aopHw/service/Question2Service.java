package com.example.aopHw.service;

import com.example.aopHw.dao.Quesiton2DAO;
import com.example.aopHw.domain.Question2;
import com.example.aopHw.exception.QuestionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Question2Service {
    @Autowired
    private Quesiton2DAO quesiton2DAO;

    public List<Question2> findAll(){
        return quesiton2DAO.findAll();
    }

    public List<Question2> findById(Integer id) throws QuestionNotFoundException {
        List<Question2> res = quesiton2DAO.findById(id);
        if(res.isEmpty()){
            throw new QuestionNotFoundException(id);
        }
        return res;
    };
}
