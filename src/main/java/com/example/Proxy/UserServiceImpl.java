package com.example.Proxy;

public class UserServiceImpl implements UserService{
    @Override
    public void login(String username, String password) throws InterruptedException {
        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUser() throws InterruptedException {
        System.out.println("删除用户");
        Thread.sleep(1500);

    }

    @Override
    public String[] selectUser() throws InterruptedException {
        System.out.println("查询用户");
        String[] users = {"张三", "李四", "王五"};
        Thread.sleep(500);
        return users;
    }
}
