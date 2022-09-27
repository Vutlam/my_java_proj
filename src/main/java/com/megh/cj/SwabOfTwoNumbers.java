package com.megh.cj;

public class SwabOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swab a = " +a+ " and  b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swab a = " +a+ " and b = " +b);
    }
}
