package com.example.learn.Thread;

import java.util.ArrayList;
import java.util.Random;

public class ThreadTest5 {
    public static void main(String[] args) throws InterruptedException {
//        目标：有100份礼物，小红和小明分别发送，当利于少于10份时，就不再发送
//        利用多线程模拟出该过程，并将线程的名称打印出来，并最后控制台分别打印小红小红发送了多少份，小明发送了多少份
        ArrayList<String> gift = new ArrayList<>();
        String[] names = {"口红","手机","电脑","衣服","鞋子","袜子","裤子","帽子","围巾","手套","眼镜","项链","手链","耳环","戒指"};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(names[random.nextInt(names.length)] +(i+1));
        }
        System.out.println(gift);
        SendThread xh = new SendThread(gift, "小红");
        xh.start();
        SendThread xm = new SendThread(gift, "小明");
        xm.start();
        xm.join();
        xh.join();
        System.out.println(xm.getCount());
        System.out.println(xh.getCount());
    }
}
