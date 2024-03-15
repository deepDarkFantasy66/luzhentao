package com.example.learn.demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;

import java.util.ArrayList;
import java.util.List;

public class EasyExcelTest {
    public static void main(String[] args) {
        // 创建数据列表
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("Item1", "123456789012345"));
        dataList.add(new Data("Item2", "234567890123456"));
        // ... 添加其他数据 ...

        // 写入数据到 Excel 文件
        String fileName = "D:\\test.xlsx";
        EasyExcel.write(fileName, Data.class).sheet("Sheet1").doWrite(dataList);
    }

    public static class Data {
        @ExcelProperty("名称")
        private String name;

        @ExcelProperty("数量")
        private String quantity;

        public Data(String name, String quantity) {
            this.name = name;
            this.quantity = quantity;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    }
}
