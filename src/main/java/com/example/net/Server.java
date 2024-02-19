package com.example.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
//        创建一个服务端对象
        DatagramSocket socket = new DatagramSocket(7777);
//        创建一个数据包对象,64kb
        byte[] bytes = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
//        开始正式使用数据包接收数据
        socket.receive(packet);
        int length = packet.getLength();
        String rs = new String(packet.getData(),0,length);
        System.out.println(rs);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(packet.getPort());
//        释放资源
        socket.close();

    }
}
