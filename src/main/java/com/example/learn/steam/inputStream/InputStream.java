package com.example.learn.HashSet.steam.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        extracted3();
    }

    /**
     * jdk7之前的写法
     */
    private static void extracted() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\test.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    /**
     * jdk7之后的写法
     * fis.close()会自动调用
     */
    public static void extracted1(){
        try ( FileInputStream fis = new FileInputStream("D:\\test.txt")){
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 读取多个字节
     */
    public static void extracted3(){
        try (FileInputStream fis = new FileInputStream("D:\\test.txt")){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes,0,len));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
