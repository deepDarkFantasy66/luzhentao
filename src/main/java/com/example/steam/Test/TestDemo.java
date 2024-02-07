package com.example.steam.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TestDemo {
    /**
     * 对图片进行加密
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Byte> list = new ArrayList<>();
//       创建文件输入流，获取要加密的文件
        try(FileInputStream fis = new FileInputStream("C:\\Users\\jhon\\OneDrive\\桌面\\简历以及照片\\page1.jpg")){
//            创建一个容器，用来存放读取的数据
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    list.add(bytes[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
//        创建一个输出流，将加密后的文件写入到文件中
        try(FileOutputStream fis = new FileOutputStream("C:\\Users\\jhon\\OneDrive\\桌面\\简历以及照片\\page1.jpg")){
            list.forEach(b->{
                try {
                    fis.write(b^2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
