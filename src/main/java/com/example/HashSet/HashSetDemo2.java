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
//            计算hash值存入链表的位置，先计算hashCode的值，然后计算hashcode的值向左移动16位取异或，最后取模余16
            System.out.println(("a".hashCode()^("a".hashCode()>>>16)) % 16);
        } catch (StudentException e) {
            throw new RuntimeException(e);
        }

        System.out.println(hashSet);
    }
}
