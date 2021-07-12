package com.company.Circlein;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res=0;
        for (; num>0 ; num/=10) {
            int value=0;
            int count=num%10;
            for (int i = num; i >0 ; i/=10 ){
                if (i%10==count){
                    value++;
                }
            }
            if (value>res){
                res=value;
            }
        }
        if (res==1){
            System.out.println("NO");
        }
        else if (res>1) {
            System.out.println("YES");
        }
    }
}
