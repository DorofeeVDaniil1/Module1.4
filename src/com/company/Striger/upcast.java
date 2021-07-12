package com.company.Striger;

import java.util.Scanner;

public class upcast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char temp = Charat(input);
        System.out.println(upercases(temp));
    }
    public static char Charat (String input){
        char c =input.charAt(0);
        return c;
    }
    public static char upercases(char temp){
        char up = Character.toUpperCase(temp);
        return up;

    }

}

