package com.example.Collections;

import com.example.demo.Student;
import com.example.demo.StudentException;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsDemo {
    public static void main(String[] args) {
//        批量添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
        System.out.println(list);
//        打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
//        二分法查找
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, "d");
        System.out.println(index);
//        根据默认的自然排序获取最大、最小值
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
//        交换集合中制定位置的元素
        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);

        ArrayList<Student> students = new ArrayList<>();
        try {
            students.add(new Student("张三", 33, 100, 100, 100));
            students.add(new Student("李四", 53, 100, 100, 100));
            students.add(new Student("王五", 21, 100, 100, 100));
            students.add(new Student("赵六", 23, 100, 100, 100));
            System.out.println(Collections.max(students));
            System.out.println(Collections.min(students));
        } catch (StudentException e) {
            throw new RuntimeException(e);
        }
//        逆序
        Collections.reverse(students);
        System.out.println(students);
//        排序
        Collections.sort(students);
        System.out.println(students);
    }
}
