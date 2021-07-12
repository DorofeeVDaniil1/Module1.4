package com.company.Methods;

import java.util.Scanner;

public class Edu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(),i= in.nextInt();
    }
    public static void writenum(int x){
        System.out.println(x);
    }
    public static void writeArr(int [] arr){
        for (int i = 0 ; i < arr.length-1; i++) {
            System.out.println("Знвчение массива = "+ arr[i]);

        }
    }
}
