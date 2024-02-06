package com.example.steam;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三,23");
        list.add("李四,24");
        list.add("王五,25");
        Map<String, Integer> map = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return Integer.valueOf(s.split(",")[1]) >= 24;
            }
        }).collect(Collectors.toMap(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s.split(",")[1]);
            }
        }));
        System.out.println(map);
    }
}
