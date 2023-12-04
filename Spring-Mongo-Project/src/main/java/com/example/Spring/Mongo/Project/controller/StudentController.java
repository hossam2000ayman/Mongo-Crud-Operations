package com.example.Spring.Mongo.Project.controller;

import com.example.Spring.Mongo.Project.collection.Student;
import com.example.Spring.Mongo.Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("add")
    public String saveStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return student.getId();
    }


    @DeleteMapping("delete/{id}")
    void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("{id}")
    Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }


    @GetMapping
    List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }


    @PutMapping("update/{id}")
    Student updateStudent(@PathVariable String id, @RequestBody Student newStudent) {
        return studentService.updateStudent(id, newStudent);
    }
}
