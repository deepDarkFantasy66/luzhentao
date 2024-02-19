package com.example.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args)  throws Exception{
//        创建一个客户端对象
            DatagramSocket socket = new DatagramSocket(6666);
            byte[] bytes = "哈哈哈哈我是快乐的小青蛙".getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),7777);
            socket.send(packet);
            System.out.println("发送成功");
            socket.close();
    }
}
