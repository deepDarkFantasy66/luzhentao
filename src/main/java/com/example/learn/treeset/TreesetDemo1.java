package com.example.learn.treeset;

import com.example.learn.demo.Student;
import com.example.learn.demo.StudentException;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDemo1 {
    public static void main(String[] args) {
        /**
         * 如果同时具备比较器和自然排序，以比较器为主
         */
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ageResult = o1.getAge() - o2.getAge();
                int nameResult =ageResult ==0?o1.getName().compareTo(o2.getName()):ageResult;
                return nameResult;
            }
        });

        try {
            students.add(new Student("张三", 33, 100, 100, 100));
            students.add(new Student("李四", 53, 100, 100, 100));
            students.add(new Student("王五", 21, 100, 100, 100));
            students.add(new Student("赵六", 66, 100, 100, 100));
            System.out.println(students);
        } catch (StudentException e) {
            throw new RuntimeException(e);
        }
       }
}
