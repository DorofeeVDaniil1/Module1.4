package com.company.Methods;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
        System.out.println(min(a,b,c,d));

    }
    public static int min(int a, int b, int c, int d){
        int[] arr = new int[]{a,b,c,d};
        int minValue = arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
