package com.example.aopHw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointCuts {
    //@Pointcut("within(com.example.aopHw.dao..*)")
    //@Pointcut("bean(*DAO)")
    @Pointcut("execution(* com.example.aopHw.dao.*.question1*(..))")
    public void inDataAccessLayer(){}
}
