package com.example.Learn.HashSet.steam;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

public class Stringdemo {
    public static void main(String[] args) {
        extracted2();
    }

    private static void extracted() {
        //        中文汉字的组成是三个字节，通常都是负数的字节组成
//        可能会出现正数，但是第一个字节肯定是负数
        String s = "你好，世界";
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte);
        }
    }
    private static void extracted1() {
//        指定字符集为GBK，中文汉字的组成是两个字节
        try {
            String s = "你好，世界";
            byte[] bytes = s.getBytes("GBK");
            for (byte aByte : bytes) {
                System.out.print(aByte);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public static void extracted2(){
        try {
            byte[] bytes = {-28,-67,-96,-27,-91,-67,-17,-68,-116,-28,-72,-106,-25,-107,-116};
            byte[] gbkbtes = {-60,-29,-70,-61,-93,-84,-54,-64,-67,-25};
            String s1 = new String(bytes);
//            将字符集编码指定为GBK
            String s2 = new String(gbkbtes,"GBK");
            System.out.println(s1+"----"+s2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
