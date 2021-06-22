package com.company.Cicle;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int minNum = 11;

        while (a > 0) {
            if ((a % 10) % 2 != 0 || (a % 10) % 2 != 1) {
                minNum = Math.min(a % 10, minNum);
            }
            a/=10;

        }
        System.out.println(minNum==11 ? "NO":minNum);
    }
}