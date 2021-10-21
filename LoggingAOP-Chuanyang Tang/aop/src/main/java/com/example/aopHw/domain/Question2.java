package com.example.aopHw.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Question2 {
    private Integer id;
    private String title;
    private Integer ans;
}
