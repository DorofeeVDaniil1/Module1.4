package com.company.Massive;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), arr[]= new int[len],temp;
        //заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[len-i-1];
            arr[len-i-1]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        
    }
}
