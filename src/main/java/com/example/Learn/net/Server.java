package com.example.Learn.HashSet.net;

import com.example.Learn.HashSet.utils.SpringLogger;

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
        SpringLogger.logger.info("接收到的数据是：" + rs);
        SpringLogger.logger.info("客户端的ip地址是："+packet.getAddress().getHostAddress());
        SpringLogger.logger.info("客户端的端口号是："+packet.getPort());
//        释放资源
        socket.close();

    }
}
