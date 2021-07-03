package com.company.Massive;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(),arr[]=new int[len],count=4;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=count;
            System.out.print(arr[i]+" ");
            count+=3;



        }


    }
}
