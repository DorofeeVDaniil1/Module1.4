package com.company.Cicle;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count=0;
        while (a!=25){
            if (a%2==0){
                count+=a;
                a--;
            }
            else {a--; }
        }
        System.out.println(count);
    }

}