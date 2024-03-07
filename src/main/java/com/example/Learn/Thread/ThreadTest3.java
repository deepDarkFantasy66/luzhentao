package com.example.Learn.HashSet.Thread;

public class ThreadTest3 {
    public static void main(String[] args) {
        Desk desk = new Desk();
        new Thread(() -> {
            while (true){
                desk.put();
            }
        },"海绵宝宝").start();

        new Thread(() -> {
            while (true){
                desk.put();
            }
        },"章鱼哥").start();

        new Thread(() -> {
            while (true){
                desk.put();
            }
        },"派大星").start();

        new Thread(() -> {
            while (true){
                desk.get();
            }
        },"痞老板").start();

        new Thread(() -> {
            while (true){
                desk.get();
            }
        },"珊迪").start();
    }
}
