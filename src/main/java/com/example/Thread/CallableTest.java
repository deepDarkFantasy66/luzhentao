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

/**
 * callable是一个泛型接口，需在调用时定义
 * 与runnable接口相比，callable接口的call方法可以有返回值
 */
class MyCallable implements Callable<String> {
    private int i;

    public MyCallable(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += j;
        }
        return "线程求出的和为"+sum;
    }
}
