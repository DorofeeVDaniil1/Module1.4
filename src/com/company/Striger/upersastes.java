package com.company.Striger;

import java.util.Scanner;

public class upersastes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char temp = CharAtter(input);
      //  System.out.println(Uppercaserw(temp));
        if (Character.isUpperCase(temp)){
            Down(temp);
        }
        else if (Character.isLowerCase(temp)){
            Up(temp);
        }
        else {
            System.out.println(input);
        }

       // CharrAll(input);
    }
    public static char CharAtter(String input){
        char c =input.charAt(0);
        return c;

    }
//    public static void CharrAll(String input){
//
//        for (int i = 0; i < input.length(); i++) {
//
//            char b = input.charAt(i);
//            System.out.print(b);
//        }
//
//    }
//    public static char Uppercaserw(char c){
//        char out = Character.toUpperCase(c);
//        return out;
//    }
    public static void Up(char c){
        System.out.println(Character.toUpperCase(c));

    }
    public static void Down(char c){
        System.out.println(Character.toLowerCase(c));
    }


}
