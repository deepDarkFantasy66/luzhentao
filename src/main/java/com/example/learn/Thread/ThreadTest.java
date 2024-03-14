package com.example.learn.Thread;


import com.example.learn.utils.SpringLogger;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread("线程A");
        mt1.start();
        mt1.join();
        MyThread mt2 = new MyThread("线程B");
        mt2.start();
        mt2.join();
//        获取主线程的名字
//        哪个线程在执行他，就是哪个线程的名字
        Thread thread = Thread.currentThread();
        SpringLogger.logger.debug("主线程的名字：" + thread.getName());

    }
}

