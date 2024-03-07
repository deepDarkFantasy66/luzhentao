package com.example.Learn.GenericsDemo;

public class Generics {
    /**
     * 泛型方法
     * 1.非静态方法：内部的泛型会根据类的泛型去匹配
     * 2.静态方法：静态方法中如果加入了泛型，则必须声明出自己独立的泛型
     * -时机：在调用方法的时候，传入实际参数的时候， 确定泛型的类型
     * @param args
     */
    public static void main(String[] args) {
        Student<Integer> student = new Student<>();
        student.setE(100);
        System.out.println(student);
        String[] strings = {"a", "b", "c"};
        Integer[] integers = {1, 2, 3};
        Double[] doubles = {1.1, 2.2, 3.3};
        printArray(strings);
        printArray(integers);
        printArray(doubles);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }
}
