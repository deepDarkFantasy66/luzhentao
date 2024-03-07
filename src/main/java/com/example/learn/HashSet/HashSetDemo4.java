package com.example.learn.HashSet;

import java.util.HashSet;

public class HashSetDemo4 {
    /**
     * hashSet底层是一个数组，数组中的每一个元素是一个链表
     * 当链表的长度超过8的时候并且数组长度没有超过64，会扩容数组的长度
     * 当链表的长度超过8的时候并且数组长度超过64，会将链表转换成红黑树
     */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("q");
        hashSet.add("¡");
        hashSet.add("±");
        hashSet.add("Á");
        hashSet.add("Ñ");
        hashSet.add("á");
        hashSet.add("Ǒ");
        hashSet.add("ρ");

    }
    private static void findHastIsOne() {
        for (int i = 97; i < 1000; i++) {
            char c = (char) i;
            String s = String.valueOf(c);
            int hashCode = s.hashCode();
            hashCode = (hashCode ^ (hashCode >>> 16)) %16;
            if (hashCode == 1) {
                System.out.println(s);
            }
        }
    }
}
