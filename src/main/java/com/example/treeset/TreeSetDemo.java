package com.example.treeset;

import ch.qos.logback.classic.LoggerContext;
import com.example.demo.Student;
import com.example.demo.StudentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeSet;

public class TreeSetDemo {
    public static final Logger logger = LoggerFactory.getLogger(TreeSetDemo.class);
    public static void getLogger() {
        TreeSet<Student> treeSet = new TreeSet<>();
        logger.info("玛卡巴卡");
        logger.error("依古比古");
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
