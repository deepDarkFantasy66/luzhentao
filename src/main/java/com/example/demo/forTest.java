package com.example.demo;

public class forTest {
    public static void main(String[] args) {
        pointRectangele();
    }
    public static void pointRectangele(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+ "="+ i*j +"\t");
            }
            System.out.println();
        }
    }
}
