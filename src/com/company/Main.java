package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt(),b= in.nextInt();
        if (a==0&&b==0){
            System.out.println("Нет решений");
        }
        else if(a>0&&b>0){
            System.out.println("любое");
        }
        else if(a>0&&b<0){
            System.out.println("x>"+b/a+"  x<"+(-b/a));
        }
        else if(a==0&&b<0){
            System.out.println("Нет решений");

        }
        else if(a==0&&b>0){
            System.out.println("Любое");
        }




	// write your code here
    }
}
