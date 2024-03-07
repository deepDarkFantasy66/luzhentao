package com.example.learn.HashSet.steam.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
//        extracted();
        extracted1();
    }

    private static void extracted() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("D:\\test.txt"));
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void extracted1() {
        try (FileOutputStream fos  = new FileOutputStream(new File("D:\\test.txt"),true)){
            fos.write("helloworld".getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
