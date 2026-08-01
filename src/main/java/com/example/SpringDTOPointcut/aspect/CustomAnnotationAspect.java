package com.example.SpringDTOPointcut.aspect;


import com.example.SpringDTOPointcut.customAnnotation.TrackExecutionTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.smartcardio.ATR;

@Component
@Aspect
public class CustomAnnotationAspect {

//    @Before("@annotation(jdk.jfr.Timestamp)")
//    public  void  logBeforeCreate(){
//        System.out.println("Method intercepted");
//    }


    @Around("@annotation( trackExecutionTime )")
    public  Object MeasureExecutionTime(ProceedingJoinPoint joinPoint,
                                        TrackExecutionTime trackExecutionTime)
            throws Throwable {
        System.out.println("Method intercepted");

        long startTime=System.currentTimeMillis();

        try{

            return joinPoint.proceed();

        }
        finally {

            long endTime=System.currentTimeMillis();
            long totalTimeTaken= endTime- startTime;

            String operation=trackExecutionTime.operation();

            if(operation.isBlank()){
                operation=joinPoint.getSignature().getName();
            }

            long warningThreashold=trackExecutionTime.warnAfter();
            if(totalTimeTaken >= warningThreashold){
                System.out.println("SLOW OPERATION ALERT");
                System.out.println("Total time taken by :  " + operation + "  : " + totalTimeTaken);
            }else{
                System.out.println("Total time taken by :  " + operation + "  : " + totalTimeTaken);
            }

        }
    }




}
