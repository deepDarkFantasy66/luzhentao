package com.example.learn.demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MyClass {
    private static int myStaticVar;

    public static void myMethod() {
        // 这将会报错，因为在静态方法中不能使用this关键字
        int x = MyClass.myStaticVar;
    }
    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //选择排序
    public static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < len; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    //二分法查找
    public static int binarySearch(int[] arr,int target) {
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==target) {
                return mid;
            }else if(arr[mid]<target) {
                left = mid+1;
            }else if(arr[mid]>target) {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void localDateTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(1996, 5, 7,12,00,01);
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime shanghai = ZonedDateTime.of(now, ZoneId.of("Asia/Shanghai"));
        System.out.println(shanghai);
        System.out.println(of.getYear());
        System.out.println(of.getMonthValue());
        System.out.println(of.getDayOfMonth());
        System.out.println(of.getDayOfWeek());
        System.out.println(of.plusYears(1));
        System.out.println(of.plusMonths(1));
        System.out.println(of.plusDays(1));
        System.out.println(of.minusYears(1));
        System.out.println(of.minusMonths(1));
        System.out.println(of.minusDays(1));
        System.out.println(of.isAfter(now));
        System.out.println(now);
        System.out.println(of);

    }

    public static void main(String[] args) {
        localDateTime();
    }
}