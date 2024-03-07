package com.example.Learn.HashSet.Thread;

public class ThreadTest4 {
    public static void main(String[] args) {
//        目标：拓展悲观锁，乐观锁原理
//        悲观锁：一开始就上锁，不管存不存在并发问题，先上锁，再操作
//        乐观锁：一开始不上锁，先操作，再判断是否有并发问题，有则回滚，重新操作
//        需求：1个静态变量，100个线程，每个线程对其加100次
        Runnable taget = new MyRunnable1();
        for (int i = 0; i < 100; i++) {
            new Thread(taget).start();
        }
    }
}
