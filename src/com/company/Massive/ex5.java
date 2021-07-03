package com.company.Massive;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean oddnumber = false;

        int[] array;
        double sum = 0;
        int sum1 ;
        sum1 = 0;

        array = new int[a];

        for (int b=0; b < array.length; b++){
            array[b] = in.nextInt();}

        for (int i = 0 ; i < array.length; i++) {
            if( array[i] % 2 != 0){
                sum1 += 1;
                sum += array[i];
                oddnumber = true;
            };
        }

        double average = sum / sum1;

        if (oddnumber == false){
            System.out.println("NO");
        }
        else{
            System.out.format("%.2f",average );
        }


    }
}