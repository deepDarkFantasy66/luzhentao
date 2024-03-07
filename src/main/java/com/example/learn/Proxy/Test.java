package com.example.learn.Proxy;

import java.math.BigDecimal;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        UserService us = ProxyUtil.createProxy(new UserServiceImpl());
        us.login("admin", "123");
        System.out.println("===============");
        us.deleteUser();
        System.out.println("===============");
        String[] name = us.selectUser();
        System.out.println("查询到的用户有：" + Arrays.toString(name));
        System.out.println("===============");
//    bigDecimal除法
        System.out.println(new BigDecimal(1).divide(new BigDecimal(3), 2, BigDecimal.ROUND_HALF_UP));
    }

}
