package com.example.Spring.Mongo.Project.repository;

import com.example.Spring.Mongo.Project.collection.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
}
