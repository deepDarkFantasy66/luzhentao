package com.example.learn.HashSet.Map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        ArrayList<String> js = new ArrayList<>();
        Collections.addAll(js, "南京", "无锡", "常州");
        ArrayList<String> hb = new ArrayList<>();
        Collections.addAll(hb, "武汉", "黄石", "襄阳");
        ArrayList<String> sc = new ArrayList<>();
        Collections.addAll(sc, "成都", "绵阳", "德阳");
        hashMap.put("江苏", js);
        hashMap.put("湖北", hb);
        hashMap.put("四川", sc);
        System.out.println(hashMap);
        hashMap.forEach((s, strings) -> System.out.println(s + "=" + strings));
        Set<Map.Entry<String, List<String>>> entries = hashMap.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            String key = entry.getKey();
            System.out.print(key +"=");
            List<String> value = entry.getValue();
            for (int i = 0; i < value.size() - 1; i++) {
                System.out.print(value.get(i) + ", ");
            }
            System.out.println(value.get(value.size() - 1));
        }

    }
}
