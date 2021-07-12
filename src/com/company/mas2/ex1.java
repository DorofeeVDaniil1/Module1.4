package com.company.mas2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long num = in.nextLong();


        StringBuilder sb = new StringBuilder(Long.toBinaryString(num));
        System.out.println(sb.reverse());

    }
}
