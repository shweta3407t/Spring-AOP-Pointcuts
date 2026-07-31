package com.example.SpringDTOPointcut.controller;


import com.example.SpringDTOPointcut.dto.Student;
import com.example.SpringDTOPointcut.service.StudentService;
 import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLContext;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private  StudentService studentService;

    public  StudentController (StudentService s){
        this.studentService=s;
    }


    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        Student studentResponse=studentService.createStudent(student );

        return ResponseEntity.ok(studentResponse);
    }


    @GetMapping
    public ResponseEntity<String> getStudent( ){

        String studentResponse=studentService.getStudent( );

        return ResponseEntity.ok(studentResponse);
    }


}
