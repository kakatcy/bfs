package com.example.aopHw.controller;

import com.example.aopHw.domain.Question2Response;
import com.example.aopHw.service.Question2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question2Controller {
    @Autowired
    private Question2Service question2Service;

    @GetMapping("/question2")
    public ResponseEntity<Question2Response> findAll(String res){
        Question2Response question2Response = Question2Response.builder().question2List(question2Service.findAll()).build();
        return new ResponseEntity<>(question2Response, HttpStatus.OK);
    }
}
