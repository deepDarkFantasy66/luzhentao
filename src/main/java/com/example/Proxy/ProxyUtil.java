package com.example.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserService userService){
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("login")||method.getName().equals("deleteUser")||method.getName().equals("selectUser")){
                            long startTime = System.currentTimeMillis();
                            Object rs = method.invoke(userService,args);
                            long endTime = System.currentTimeMillis();
                            System.out.println("方法"+method.getName()+"执行时间："+(endTime-startTime));
                            return rs;
                        }else {
                            return method.invoke(userService,args);
                        }
                    }
                });
        return userServiceProxy;
    }
}
