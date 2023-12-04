package com.example.Spring.Mongo.Project.service;

import com.example.Spring.Mongo.Project.collection.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    void deleteStudent(String id);

    Student getStudent(String id);


    List<Student> findAllStudents();


    Student updateStudent(String id, Student newStudent);

}
