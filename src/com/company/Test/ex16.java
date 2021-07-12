package com.company.Test;

import java.util.Arrays;
import java.util.Scanner;



public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(),arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        };







    }

}
