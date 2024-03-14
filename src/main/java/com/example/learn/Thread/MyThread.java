package com.example.learn.Thread;


import com.example.learn.utils.SpringLogger;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread thread = Thread.currentThread();
            SpringLogger.logger.info(thread.getName() + "运行，i = " + i);
        }
    }
}
