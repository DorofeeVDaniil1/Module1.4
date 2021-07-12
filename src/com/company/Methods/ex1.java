package com.company.Methods;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(4000/1000+" "+ 4000/1000);
        //System.out.println(SumOfDigits(n));

    }
    public static int SumOfDigits(int n){
        int res=0;
        while (n>0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
}
