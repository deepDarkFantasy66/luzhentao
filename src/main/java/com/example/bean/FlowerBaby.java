package com.example.bean;

import lombok.Data;

@Data
public class FlowerBaby {
    private String name;
    private Integer age;

    public FlowerBaby(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public FlowerBaby() {
    }

    @Override
    public String toString() {
        return "FlowerBaby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
