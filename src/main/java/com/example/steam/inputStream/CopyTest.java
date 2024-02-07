package com.example.steam.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) {
//        创建文件输入流和输出流
        try ( FileInputStream fis = new FileInputStream("D:\\test.txt");
              FileOutputStream fos = new FileOutputStream("D:\\test1.txt")){
//        定义一个缓冲区
            byte[] bytes = new byte[1024];
//          定义一个长度
            int len;
//            循环读取
            while ((len = fis.read(bytes)) != -1) {
//                写出数据
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
