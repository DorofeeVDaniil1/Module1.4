package com.company.Massive;

import java.util.Scanner;

public class NegNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), arr[] = new int[len], temp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < 0) {


                    temp = arr[len - i - 1];
                    arr[len - i - 1] = arr[i];
                    arr[i] = temp;

            }
            for (int j = 0; j < 0; j++) {
                
            }

        }
        
    }
}
