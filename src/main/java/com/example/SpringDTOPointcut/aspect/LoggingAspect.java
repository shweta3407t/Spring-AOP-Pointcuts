package com.example.SpringDTOPointcut.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

//    @Before("execution( * com.example.SpringDTOPointcut..*(..))")//method level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }

//    @Before("within( com.example.SpringDTOPointcut.service.*  ) ")//class level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//
//    }

//
//    @Before("@annotation(jdk.jfr.Timestamp)")//method level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }


//    @Before("bean(studentService)")//bean level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }







    //combine designator
    @Before("bean(studentService) || bean(studentController) )")//bean level
    public  void  logBeforeCreate( ) {
        System.out.println("Method intercepted");
    }

    @Before("within(com.example.SpringDTOPointcut.service..*  )" +
            " && " +
            "execution(public * *(..)  )")//bean level
    public  void  logBeforeCreate1( ) {
        System.out.println("Method intercepted");
    }














}
