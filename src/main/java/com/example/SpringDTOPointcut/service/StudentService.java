package com.example.SpringDTOPointcut.service;

 import com.example.SpringDTOPointcut.customAnnotation.TrackExecutionTime;
 import com.example.SpringDTOPointcut.dto.Student;
 import jdk.jfr.Timestamp;
 import org.springframework.stereotype.Service;


@Service
public class StudentService {

//    @Timestamp

    @TrackExecutionTime(warnAfter =  1500 , operation =  "Creating student" )
    public Student createStudent(Student s){
        System.out.println("Student created");
        return s;
    }

//    @Timestamp

    @TrackExecutionTime(warnAfter =  1500 , operation =  "Get student data")
    public  String getStudent( ){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String s="All student data";
        System.out.println(s);

        return  s;
    }
}
