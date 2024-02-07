package com.example.steam.Buffer;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) {
//        创建文件输入流和输出流
        long l = System.currentTimeMillis();
        try ( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\jhon\\OneDrive\\桌面\\房屋建筑物.doc"));
              BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\房屋建筑物.doc"))){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
