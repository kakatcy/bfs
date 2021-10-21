package com.example.aopHw.controller;

import com.example.aopHw.service.Question1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1Controller {

    @Autowired
    private Question1Service question1Service;

    @GetMapping("/question1")
    public ResponseEntity<String> executionTime(){
        System.out.println("-----Executing Controller Layer-----");
        String res = question1Service.question1();
        return ResponseEntity.ok(res);
    }
}
