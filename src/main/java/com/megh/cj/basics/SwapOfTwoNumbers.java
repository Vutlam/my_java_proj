package com.megh.cj.basics;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println("Before swab a = " + a + " and  b = " + b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swab a = " + a + " and b = " + b);
        System.out.println("Before swab a = " + a + " and  b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swab a = " + a + " and b = " + b);
    }
}
