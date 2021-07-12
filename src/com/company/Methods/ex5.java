package com.company.Methods;


import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int len = in.nextInt(), arr[] = new int[len];

            for (int i =0; i < arr.length ; i++) {
                arr[i]= in.nextInt();
            }
        double temp = readArray(arr);
        System.out.printf("%.2f",temp);

    }
    public static double  readArray( int [] arr){
        double sum=0;
        int count=0;

        for (int x:arr) {
            if (x/1000>0 && x/1000<10){
                sum+=x;
                count++;
            }
        }
        double fin = sum/count;
        if (count == 0) return -1.00;
        else return fin;

    }
}
