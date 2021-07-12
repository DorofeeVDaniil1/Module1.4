package com.company.Circlein;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int count=1;
        while (a!=b){
            count++;
            if (a>b){
                a-=b;
            }
            else {
                b-=a;
            }

        }
        System.out.println(a+" "+count);
    }
}
