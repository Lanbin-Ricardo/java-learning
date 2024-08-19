package com.example.pojo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;
}
