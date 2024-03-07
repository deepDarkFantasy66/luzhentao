package com.example.Learn.Thread;

public class ThreadTest1 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("main运行，i = " + i);
            if (i == 3) {
//                当前调用这个方法的线程休眠3秒
                Thread.sleep(3000);
            }
        }

    }
}
