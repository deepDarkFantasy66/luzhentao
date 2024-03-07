package com.example.learn.Thread;

import com.example.learn.HashSet.utils.SpringLogger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money; // 账户余额
    private String id; // 卡号

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account() {
    }

    public Account(double money, String id) {
        this.money = money;
        this.id = id;
    }

    /**
     * this用来锁定当前对象
     * @param money
     */
    public  void DrawMoney(Double money) {
        String name = Thread.currentThread().getName();
//        this代表共享资源
        synchronized (this) {
            if (this.money >= money) {
                SpringLogger.logger.info(name + "取钱成功！吐出钞票：" + money);
                this.money -= money;
                SpringLogger.logger.info("余额为：" + this.money);
            } else {
                SpringLogger.logger.info(name + "取钱失败！余额不足！");
            }
        }
    }

    /**
     * 静态方法建议使用类名.class作为锁对象
     * @param money
     * @param account
     */
    public static void DrawMoneyStatic(Double money, Account account) {
        synchronized (Account.class){
        }
    }

    /**
     * 同步方法，synchronized修饰方法，锁对象是this
     * 如果是静态方法，锁对象是类名.class
     * @param money
     */
    public synchronized void DrawMoney1(Double money) {
        String name = Thread.currentThread().getName();
            if (this.money >= money) {
                SpringLogger.logger.info(name + "取钱成功！吐出钞票：" + money);
                this.money -= money;
                SpringLogger.logger.info("余额为：" + this.money);
            } else {
                SpringLogger.logger.info(name + "取钱失败！余额不足！");
            }
    }
//    用final修饰，保证线程安全
    private final Lock lk = new ReentrantLock();
    public void DrawMoney2(Double money) {
            String name = Thread.currentThread().getName();
//            线程执行到这一步的时候，进行加锁
            lk.lock();
        try {
            if (this.money >= money) {
                    SpringLogger.logger.info(name + "取钱成功！吐出钞票：" + money);
                    this.money -= money;
                    SpringLogger.logger.info("余额为：" + this.money);
                } else {
                    SpringLogger.logger.info(name + "取钱失败！余额不足！");
                }
        } catch (Exception e) {
            SpringLogger.logger.error("取钱失败！");
            e.printStackTrace();
        } finally {
//            放在finally里面，保证线程执行完毕后，一定会解锁
//            线程执行到这一步的时候，进行解锁
            lk.unlock();
        }
    }
}
