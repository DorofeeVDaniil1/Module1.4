package com.company.Massive;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(),arr[]=new int[n],sum=0,x=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();

        }
        for (int y:arr) {
            if (y%2==0){
                sum+=y;
                x++;
            }

        }
        if (x!=0) {
            System.out.println(sum);
        }
        else {
            System.out.println("NO");
        }
    }
}
