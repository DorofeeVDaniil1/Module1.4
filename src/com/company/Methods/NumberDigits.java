package com.company.Methods;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b= in.nextInt();
        System.out.println(SumOfSeven(a,b));



    }
    public static int SumOfSeven(int a, int b){
        int res=0;
        for (; a <=b; a++) {
            if(a%7==0 && a/10>0 && a/10<10){
                int i =a;
                for (; i>0 ; i/=10) {
                    res+=i%10;

                }
            }

        }
        return res;

    }

}
