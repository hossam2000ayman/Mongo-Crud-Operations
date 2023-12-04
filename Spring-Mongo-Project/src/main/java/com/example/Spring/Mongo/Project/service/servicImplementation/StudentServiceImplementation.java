package com.example.Spring.Mongo.Project.service.servicImplementation;

import com.example.Spring.Mongo.Project.collection.Student;
import com.example.Spring.Mongo.Project.repository.StudentRepository;
import com.example.Spring.Mongo.Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudent(String id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not Found"));
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll().stream().limit(100).collect(Collectors.toList());
    }

    @Override
    public Student updateStudent(String id, Student newStudent) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not Found"));
        student.setAddress(newStudent.getAddress());
        student.setName(newStudent.getName());
        student.setMobile(newStudent.getMobile());

        return studentRepository.save(student);
    }
}
