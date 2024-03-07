package com.example.learn.HashSet.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        String s = "aabbssajshdqqqzkjsahd";
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        map.forEach((s1, integer) -> sb.append(s1).append("(").append(integer).append(")"));
        System.out.println(sb.toString());
    }

}
