package com.example.Proxy;

public interface UserService {
   void login(String username, String password) throws InterruptedException;
   void deleteUser() throws InterruptedException;
   String[] selectUser() throws InterruptedException;

}
