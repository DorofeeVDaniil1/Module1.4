package com.company.mas2;

import java.util.Scanner;

public class lost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = N*(N+1)/2;
        int K = 0;
        for(int i = 0; i<N-1; i++){
            K+=in.nextInt();}
        System.out.println(M-K);



    }
}
