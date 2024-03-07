package com.example.learn.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap是一个有序的集合，底层是一个哈希表和一个双向链表
        // LinkedHashMap的key可以为null，value也可以为null
        // LinkedHashMap的key是有序的，key的存储是按照key的哈希值进行存储的
        // 如果key是自定义的类型，那么key所属的类必须重写hashCode和equals方法
        // 如果key是自定义的类型，而且key所属的类没有重写hashCode和equals方法，那么可以通过构造方法传入一个比较器
        // 如果key是自定义的类型，而且key所属的类重写了hashCode和equals方法，而且通过构造方法传入了一个比较器，那么优先使用比较器
        LinkedHashMap<Person, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new Person("张三", 23), "北京");
        linkedHashMap.put(new Person("张三", 23), "北京");
        linkedHashMap.put(new Person("李四", 24), "上海");
        linkedHashMap.put(new Person("王五", 25), "广州");
        System.out.println(linkedHashMap);
    }
}
