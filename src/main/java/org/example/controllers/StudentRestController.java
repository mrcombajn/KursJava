package org.example.controllers;

import jakarta.annotation.PostConstruct;
import org.example.beans.baseClasses.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> studentList;

    @PostConstruct
    public void addStudents() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Jan", "Nowak"));
        studentList.add(new Student("Janina", "Nowak"));
        studentList.add(new Student("Karol", "Nowak"));
        studentList.add(new Student("Jacek", "Nowak"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {
        return studentList.get(studentId);
    }
}
