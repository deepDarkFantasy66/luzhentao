package com.example.Thread;

import com.example.utils.SpringLogger;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            SpringLogger.logger.info(  "MyRunnable运行，i = " + i);
        }
    }
}