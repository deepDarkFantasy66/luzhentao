package com.example.Learn.demo;

import java.util.Scanner;

public class loopDemo {
    public static void main(String[] args) {
        flower();
    }

    private static void checkPassword() {
        int j = 0;
        for (int i = 0; i <=100; i++) {
           if(i%2 ==0){
              j += i;
           }
        }
        System.out.println(j);
    }
//    获取水仙花数
    public static void flower(){
        int j = 0;
        for (int i = 100; i <=999 ; i++) {
            int ge  = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println(i);
                j++;
            }
        }
        System.out.println(j);
    }

}
