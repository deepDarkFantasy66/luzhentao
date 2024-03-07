package com.example.Learn.HashSet.treeset;

import com.example.Learn.HashSet.demo.Student;
import com.example.Learn.HashSet.demo.StudentException;
import com.example.Learn.HashSet.utils.SpringLogger;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void getLogger() {
        TreeSet<Student> treeSet = new TreeSet<>();
        SpringLogger.logger.info("玛卡巴卡");
        SpringLogger.logger.error("依古比古");
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
