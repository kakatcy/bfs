package com.example.aopHw.controller;

import com.example.aopHw.domain.Question2Response;
import com.example.aopHw.exception.QuestionNotFoundException;
import com.example.aopHw.service.Question2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question3Controller {

    @Autowired
    private Question2Service question2Service;

    @GetMapping("/question3/{id}")
    public ResponseEntity findByName(@PathVariable Integer id) throws QuestionNotFoundException {
//        too many try catch block
//        try{
//            UserResponse userResponse = UserResponse.builder().userList(userService.findByName(name)).build();
//            return new ResponseEntity(userResponse,HttpStatus.OK);
//        }catch (UserNotFoundException e){
//            return new ResponseEntity(ErrorMessage.builder().msg(e.getMessage()+" Not Found").build(),HttpStatus.BAD_REQUEST);
//        }
//
        Question2Response question2Response = Question2Response.builder().question2List(question2Service.findById(id)).build();
        return new ResponseEntity<>(question2Response, HttpStatus.OK);
}
}
