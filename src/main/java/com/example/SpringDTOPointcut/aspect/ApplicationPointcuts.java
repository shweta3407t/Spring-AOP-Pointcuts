package com.example.SpringDTOPointcut.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class ApplicationPointcuts {//named point cuts

    //allow intercept all controller method
    @Pointcut("within(com.example.SpringDTOPointcut.controller..*)")
    public  void controllerLayer(){}


    //allow intercept all service method
    @Pointcut("within(com.example.SpringDTOPointcut.service.StudentService)")
    public  void serviceLayer(){}


    //allow intercept all controller method
    @Pointcut("execution(public * * (..)  )")
    public void  publicMethod(){}




    //combine pointcuts
    @Pointcut("publicMethod() && serviceLayer()" )
    public void allPublicServiceMethod(){}
}
