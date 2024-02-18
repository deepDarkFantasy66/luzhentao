package com.example.Thread;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread{
    private  int count = 0;
    private List<String>  gift;
    public SendThread(List<String> gift,String name){
        super(name);
        this.gift = gift;
    }
    @Override

    public void run() {
        String name = Thread.currentThread().getName();
        Random random = new Random();
        while (true){
            synchronized (gift){
                if(gift.size()<10){
                    break;
                }
                String rs = gift.remove(random.nextInt(gift.size()));
                System.out.println(name+"发送了"+rs);
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
