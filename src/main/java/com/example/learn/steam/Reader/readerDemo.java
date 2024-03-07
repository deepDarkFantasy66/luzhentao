package com.example.learn.HashSet.steam.Reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class readerDemo {
    public static void main(String[] args) {

    }

    private static void extracted1() {
        //        如果文件中存在中文，使用FileReader不会出现乱码
        try (FileReader fr = new FileReader("D:\\test.txt")) {
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void extracted() {
//        如果用FileInputStream读取中文会出现乱码
        try (FileInputStream fis = new FileInputStream("D:\\test.txt")){
            byte[] bytes = new byte[3];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));

            }
        }catch (IOException e){
                e.printStackTrace();
            }
    }
}
