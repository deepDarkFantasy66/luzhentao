package com.example.Learn.Thread;

import com.example.Learn.HashSet.utils.SpringLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟线程通信的桌子
 */
public class Desk {
    private List<String> list = new ArrayList<>();

    /**
     * 生成汉堡包
     */
    public synchronized  void put(){
        String name  = Thread.currentThread().getName();
        if(list.size()==0){
            try {
                list.add(name+"生产的汉堡包");
                SpringLogger.logger.info(name+"生产了一个汉堡包");
                Thread.sleep(2000);
//                唤醒所有线程
                notifyAll();
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
//            有汉堡包，等待
            try {
                notify();
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 消费汉堡包
     */
    public synchronized  void get(){
        String name  = Thread.currentThread().getName();
        if(list.size()==1){
            try {
                SpringLogger.logger.info(name+"吃了"+list.get(0));
                list.remove(0);
                Thread.sleep(2000);
                notifyAll();
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            try {
                notify();
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
