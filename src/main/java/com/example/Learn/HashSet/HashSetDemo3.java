package com.example.Learn.HashSet;

import java.util.HashSet;

public class HashSetDemo3 {
    /**
        * hashSet底层是一个数组，数组中的每一个元素是一个链表
        * 当链表的长度超过8的时候并且数组长度没有超过64，会扩容数组的长度
        * 当链表的长度超过8的时候并且数组长度超过64，会将链表转换成红黑树
     */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add("f");
        hashSet.add("g");
        hashSet.add("h");
        hashSet.add("i");
        hashSet.add("j");
        hashSet.add("k");
        hashSet.add("l");
        hashSet.add("m");
        System.out.println(hashSet);
    }
}
