package com.example.Learn.Thread;

public class ThreadTest2 {
    public static void main(String[] args) {
//        创建一个账户对象
        Account account = new Account(100000, "123456");
//        创建两个线程分别代表小明和小红，再去同一个账户取钱100000
        new DrawMoneyRunnable(account,"小红").start();
        new DrawMoneyRunnable(account,"小明").start();
        //        创建一个账户对象
        Account account1 = new Account(100000, "1234567");
//        创建两个线程分别代表小黑和小白，再去同一个账户取钱100000
        new DrawMoneyRunnable(account1,"小黑").start();
        new DrawMoneyRunnable(account1,"小白").start();
    }
}
