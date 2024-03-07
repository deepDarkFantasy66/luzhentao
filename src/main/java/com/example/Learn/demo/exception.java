package com.example.Learn.HashSet.demo;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = scanner.next();
        Student student = new Student();
        student.setName(name);
        while (true){
            try {
                System.out.println("请输入学生年龄");
                int age = scanner.nextInt();
                student.setAge(age);
                break;
            } catch (StudentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("请输入学生数学成绩");
                int math = scanner.nextInt();
                student.setMath(math);
                break;
            } catch (StudentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            System.out.println("请输入学生语文成绩");
            int chinese = scanner.nextInt();
            try {
                student.setChinese(chinese);
                break;
            } catch (StudentException e) {
                System.out.println(e.getMessage());
            }
            break;
        }
        while (true){
            System.out.println("请输入学生英语成绩");
            int english = scanner.nextInt();
            try {
                student.setEnglish(english);
                break;
            } catch (StudentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(student);
    }
}