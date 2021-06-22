package com.company.Massive;

import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Форыч нужен для пробега по значениям массива, но не может изменять их
        int sum = 0;
        int maxRange = 100;
        int a[]=new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (maxRange +1)); //Целое число 0..max
        }
        for (int x: a)
            sum += x;
        System.out.println("Сума= "+sum);
    }
}
