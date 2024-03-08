package com.example.bean;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
