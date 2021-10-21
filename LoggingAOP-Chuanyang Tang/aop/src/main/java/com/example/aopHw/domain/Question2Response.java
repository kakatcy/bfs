package com.example.aopHw.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class Question2Response {
    private List<Question2> question2List;
    private Question2 question2;
    private String msg;
}