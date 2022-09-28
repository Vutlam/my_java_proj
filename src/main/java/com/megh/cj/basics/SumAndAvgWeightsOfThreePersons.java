package com.megh.cj.basics;

import java.util.Scanner;

public class SumAndAvgWeightsOfThreePersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person 1 weight :");
        float person1 = sc.nextFloat();
        System.out.println("Enter person 2 weight :");
        float person2 = sc.nextFloat();
        System.out.println("Enter person 3 weight :");
        float person3 = sc.nextFloat();
        float sumOfThreePersonsWeight = person1 + person2 + person3;
        float aveOfThreePersonsWeight = (sumOfThreePersonsWeight) / 3;
        System.out.println("person1 + person2 + person3 is :" + sumOfThreePersonsWeight);
        System.out.println("Average OfThreePersonsWeight is :" + aveOfThreePersonsWeight);
    }
}
