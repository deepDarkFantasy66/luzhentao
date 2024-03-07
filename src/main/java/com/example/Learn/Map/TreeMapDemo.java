package com.example.Learn.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap是一个有序的集合，底层是一个红黑树
        // TreeMap的key不能为null，value可以为null
        // TreeMap的key是有序的，key的排序方式是按照key的自然顺序进行排序
        // 如果key是自定义的类型，那么key所属的类必须实现Comparable接口
        // 如果key是自定义的类型，而且key所属的类没有实现Comparable接口，那么可以通过构造方法传入一个比较器
        // 如果key是自定义的类型，而且key所属的类实现了Comparable接口，而且通过构造方法传入了一个比较器，那么优先使用比较器
        TreeMap<Person,String> map = new TreeMap<>();
        map.put(new Person("张三", 23), "北京");
        map.put(new Person("张三", 23), "北京");
        map.put(new Person("李四", 24), "上海");
        map.put(new Person("王五", 25), "广州");
        System.out.println(map);
    }
}
