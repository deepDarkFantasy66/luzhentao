package com.example.learn.steam.Test;

import java.io.*;

public class TestDemo2 {
    /**
     * 拷贝一个文件夹，考虑子文件夹
     * @param args
     */
    public static void main(String[] args) {
        File src = new File("D:\\aaa");
        File dest = new File("D:\\bbb");
        if (src.equals(dest)) {
            System.out.println("文件夹不能拷贝到自己");
            return;
        }
        if(!dest.exists()){
//            如果文件夹不存在，创建文件夹
            dest.mkdir();
        }
        copyDir(src,dest);
    }

    public static void copyDir(File src, File dest) {
        File newDir = new File(dest, src.getName());
        if(newDir.mkdir()){
            System.out.println("创建文件夹成功");
        }else {
            System.out.println("创建文件夹失败");
        }
//            从数据中获取数据（File对象）
        File[] files = src.listFiles();
        for (File file : files) {
//                如果是文件，直接拷贝
            if (file.isFile()) {
                try {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(newDir, file.getName()));
                    int len;
                    byte[] bytes = new byte[1024];
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    fis.close();
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
//                如果是文件夹，递归调用
                copyDir(file, newDir);
            }
        }
    }

}
