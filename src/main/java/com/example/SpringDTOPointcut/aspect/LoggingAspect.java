package com.example.SpringDTOPointcut.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

//    //execution
//    @Before("execution( * com.example.SpringDTOPointcut..*(..))")//method level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }

//    //within
//    @Before("within( com.example.SpringDTOPointcut.service.*  ) ")//class level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }

//    //@annotation
//    @Before("@annotation(jdk.jfr.Timestamp)")//method level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }


//    //bean
//    @Before("bean(studentService)")//bean level
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }


//    //@within     //work  without inheritance
//    @Before("@within(org.springframework.stereotype.Service)")
//    public  void  logBeforeCreate3( ) {
//        System.out.println("Method intercepted");
//    }







//    //@targate    //work with or without inheritance   *********
//    @Before("@target(org.springframework.stereotype.Service)")
//    public void logBeforeCreate4() {
//        System.out.println("Method intercepted");
//    }



//    //args
//    @Before("args(com.example.SpringDTOPointcut.dto.Student)" +
//            "&&" +
//            "within(com.example.SpringDTOPointcut.service..*)")
//    public void logBeforeCreate4() {
//        System.out.println("Method intercepted");
//    }




    //@args
    @Before("@args(jdk.jfr.Timestamp)")//********
    public void logBeforeCreate5() {
        System.out.println("Method intercepted");
    }






















//    //named pointcut
//    @Pointcut("within(com.example.SpringDTOPointcut.service..*  )" +
//            " && " +
//            "execution(public * *(..)  )")
//    public  void  logPublicServiceMethod(){}


//    //combine designator
//    @Before("bean(studentService) || bean(studentController) )")
//    public  void  logBeforeCreate( ) {
//        System.out.println("Method intercepted");
//    }
//
//    @Before ("logPublicServiceMethod()")
//    public  void  logBeforeCreate1( ) {
//        System.out.println("Method intercepted");
//    }


//    //pointCuts defined in ApplicationPoints class
//    @Before ("com.example.SpringDTOPointcut.aspect.ApplicationPointcuts.serviceLayer()")
//    public  void  logBeforeCreate2( ) {
//        System.out.println("Method intercepted");
//     }





























}
