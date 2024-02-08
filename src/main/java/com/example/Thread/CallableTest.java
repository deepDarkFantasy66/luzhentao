package com.example.Thread;

import com.example.utils.SpringLogger;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws Exception {
        Callable<String> call = new MyCallable(100);
        FutureTask<String> futureTask = new FutureTask<>(call);
        new Thread(futureTask).start();
        String s = futureTask.get();
        SpringLogger.logger.info(s);
    }
}

