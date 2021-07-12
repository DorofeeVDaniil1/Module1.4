package com.company.mas3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), arr[] = new int[len],sum=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>0){
                sum++;
            }

        }
        System.out.println(sum);

    }
}
