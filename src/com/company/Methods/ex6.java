package com.company.Methods;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int [] temp = minToBegin(arr);
        System.out.println(temp);
    }
    public static int [] minToBegin(int []arr){
        int min= arr[0];
        int temp;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
                num=i;
            }
        }
        temp=arr[0];
        arr[0]=min;
        arr[num]=temp;
        for (int b = 1; b < arr.length-1; b--) {
            arr[b+1] = arr[b];
        }
       return arr;

    }

    }

