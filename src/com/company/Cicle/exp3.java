package com.company.Cicle;

import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt(),counter=4;
        String sum="2";
        while(a!=1){
//            System.out.println("Counter= "+counter);
            sum=sum+" "+Integer.toString(counter);
//            System.out.println("Sum= "+sum+ "\n");
            counter+=2;
            a--;

        }
        System.out.println(sum);
    }
}
