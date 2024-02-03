package com.example.demo;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int math;
    private int chinese;
    private int english;

    public Student() {
    }

    public Student(String name, int age, int math, int chinese, int english) throws StudentException {
        this.name = name;
        this.setAge(age);
        this.setMath(math);
        this.setChinese(chinese);
        this.setEnglish(english);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws StudentException {
        if (age>120||age<0){
            throw new StudentException("年龄不符合");
        }else {
            this.age = age;
        }
    }

    public int getMath() throws StudentException {
        if (math>100||math<0){
            throw new StudentException("数学成绩不符合");
        }else {
            return math;
        }
    }

    public void setMath(int math) throws StudentException {
        if (math>100||math<0) {
            throw new StudentException("数学成绩不符合");
        }else {
            this.math = math;
        }
    }

    public int getChinese()  {
            return chinese;
    }

    public void setChinese(int chinese) throws StudentException {
        if (chinese>100||chinese<0) {
            throw new StudentException("语文成绩不符合");
        }else {
            this.chinese = chinese;
        }
    }

    public int getEnglish(){
        return english;
    }

    public void setEnglish(int english) throws StudentException {
        if (english>100||english<0) {
            throw new StudentException("英语成绩不符合");
        }else {
            this.english = english;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", chinese=" + chinese +
                ", english=" + english +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        System.out.println(this.age+"----"+student.age);
//        降序排列
//        return -(this.age-student.age);
//        升序排列
        int ageResult = this.age-student.age;
//        更具年龄做主要排序条件，更具姓名做次要排序条件
        int nameResult = ageResult==0?this.name.compareTo(student.name):ageResult;
//       如果年龄，姓名都相同，返回1
        int result = nameResult==0?1:nameResult;
        return result;
    }
}
