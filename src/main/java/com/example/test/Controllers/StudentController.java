package com.example.test.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.Student;

@RestController
@RequestMapping("/app/student")
public class StudentController {

    @GetMapping
    public Student getStudent() {
        return new Student(1L, "paco");
    }
}