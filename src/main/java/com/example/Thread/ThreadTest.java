package com.example.Thread;

import com.example.utils.SpringLogger;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();
        for (int i = 0; i < 5; i++) {
            SpringLogger.logger.info(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            SpringLogger.logger.info(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}
