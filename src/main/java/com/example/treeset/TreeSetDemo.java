package com.example.treeset;

import com.example.demo.Student;
import com.example.demo.StudentException;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        try {
            treeSet.add(new Student("张三", 33, 100, 100, 100));
            treeSet.add(new Student("张三", 33, 100, 100, 100));
            treeSet.add(new Student("李四", 53, 100, 100, 100));
            treeSet.add(new Student("王五", 21, 100, 100, 100));
        } catch (StudentException e) {
            throw new RuntimeException(e);
        }
        System.out.println(treeSet);
    }
}
