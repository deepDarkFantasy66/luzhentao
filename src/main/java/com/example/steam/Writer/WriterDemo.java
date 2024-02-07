package com.example.steam.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) {
        extracted();
    }

    /**
     * 注意：FileWriter写入数据时，需要调用flush()或者close()方法，否则数据不会写入文件
     * flush()：刷出数据，刷出后可以继续写入
     * close()：关闭流，关闭后不能继续写入
     */
    private static void extracted() {
        try (FileWriter fw = new FileWriter("D:\\test.txt")) {
            fw.write('a');
            char [] chars = {'b','c','d','e'};
            fw.write(chars);
            fw.write("八嘎");
            fw.write("哈哈哈哈哈哈",0,2);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

