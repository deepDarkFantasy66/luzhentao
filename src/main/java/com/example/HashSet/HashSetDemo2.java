package com.example.HashSet;

import com.example.demo.Student;
import com.example.demo.StudentException;

import java.util.HashSet;

public class HashSetDemo2 {
    /**
     * hashSet想要去重，需要重写hashCode和equals方法
     * @param args
     */
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        try {
            hashSet.add(new Student("张三", 33, 100, 100, 100));
            hashSet.add(new Student("张三", 33, 100, 100, 100));
            hashSet.add(new Student("李四", 53, 100, 100, 100));
            hashSet.add(new Student("王五", 21, 100, 100, 100));
        } catch (StudentException e) {
            throw new RuntimeException(e);
        }

        System.out.println(hashSet);
    }
}
