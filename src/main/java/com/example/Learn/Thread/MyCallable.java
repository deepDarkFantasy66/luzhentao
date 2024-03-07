package com.example.Learn.HashSet.Thread;

import java.util.concurrent.Callable;

/**
 * callable是一个泛型接口，需在调用时定义
 * 与runnable接口相比，callable接口的call方法可以有返回值
 */
public class MyCallable implements Callable<String> {
    private int i;

    public MyCallable(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        Thread thread = Thread.currentThread();
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += j;
        }
        return thread.getName()+"线程求出的和为"+sum;
    }
}
