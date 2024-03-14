package com.example.learn.Thread;


import com.example.learn.utils.SpringLogger;

public class RunnableTest {
    /**
     * runnable接口实现多线程相比于thread类实现多线程的优势
     * 1.避免了单继承的局限性
     * 2.增强了程序的健壮性，代码可以被多个线程共享，代码和数据独立
     * 3.适合多个相同程序代码的线程区处理同一资源的情况
     * 4.可以用匿名内部类实现
     * 注意事项
     * mian方法代码体必须放到多线程代码之后执行，否则会导致成为单线程模式
     * @param args
     */
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

//        使用匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    SpringLogger.logger.info(  "匿名内部类运行，i = " + i);
                }
            }
        }).start();
        //    用lambda表达式实现
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                SpringLogger.logger.info(  "lambda表达式运行，i = " + i);
            }
        }).start();
        for (int i = 0; i < 5; i++) {
            SpringLogger.logger.info(  "main运行，i = " + i);
        }
    }

}

