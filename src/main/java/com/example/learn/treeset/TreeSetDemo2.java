package com.example.learn.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        ts.add("a");
        ts.add("aaaaaaa") ;
        ts.add("aa");
        ts.add("aaa");
        System.out.println(ts);
    }
}
