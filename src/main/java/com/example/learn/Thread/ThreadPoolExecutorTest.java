package com.example.learn.Thread;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
//        创建一个线程池，允许的线程数为10，最大线程数为15，线程空闲时间为8分钟，允许队列最多存在15个任务，拒绝策略为CallerRunsPolicy
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(4), new ThreadPoolExecutor.CallerRunsPolicy());
//     将target任务交给pool执行
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
