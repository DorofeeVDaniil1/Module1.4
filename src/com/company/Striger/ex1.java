package com.company.Striger;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        isDigit(input);

    }
    public static void isDigit(String input){
        try{
            Integer.parseInt(input);
            System.out.println("yes");
        }
        catch (NumberFormatException e){
            System.out.println("no");
        }


    }
}
