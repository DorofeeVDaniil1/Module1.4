package com.company.Massive;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxRange = 100;
        int a[]=new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (maxRange +1)); //Целое число 0..max
        }
// выводим массив на консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

    }
}