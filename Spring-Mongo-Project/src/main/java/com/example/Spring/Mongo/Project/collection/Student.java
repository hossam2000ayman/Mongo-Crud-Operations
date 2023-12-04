package com.example.Spring.Mongo.Project.collection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Setter
@Getter
public class Student {
    @Id
    private String id;

    private String name;
    private String address;
    private String mobile;

}
