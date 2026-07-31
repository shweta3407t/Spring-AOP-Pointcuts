package com.example.SpringDTOPointcut.service;

 import com.example.SpringDTOPointcut.dto.Student;
 import jdk.jfr.Timestamp;
 import org.springframework.stereotype.Service;


@Service
public class StudentService {

//    @Timestamp
    public Student createStudent(Student s){
        System.out.println("Student created");

        return s;
    }

//    @Timestamp
    public  String getStudent( ){
        String s="All student data";
        System.out.println(s);
        return  s;
    }

    public int dummy (){
        System.out.println("dummy method called");
        return 0;
    }
}
