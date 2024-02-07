package com.example.steam.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class TestDemo1 {
    /**
     * 统计文件中字符出现的次数
     * @param args
     */
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap();
        try (FileReader fr = new FileReader("D:\\test.txt")) {
            int i;
            while (( i= fr.read()) != -1) {
                char c = (char) i;
             if(!map.containsKey(c)){
                 map.put(c,1);
             }else {
                 map.put(c,map.get(c)+1);
             }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        map.forEach( new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb.toString());
    }
}
