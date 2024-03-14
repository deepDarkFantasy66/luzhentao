package com.example.learn.Thread;


import com.example.learn.utils.SpringLogger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable1 implements Runnable {
//    整数修改乐观锁，原子类实现
   private AtomicInteger count = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            SpringLogger.logger.info(thread.getName()+"运行，i = " +   count.incrementAndGet());
        }
    }
}