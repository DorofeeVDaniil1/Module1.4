package com.company.Striger;

import java.util.Scanner;

public class colslov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        search(string);
        System.out.println(coslov(string));

    }
    public static void search(String string){
        int col=0;
        if (string.length() !=0){
            col++;
        }
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) == ' '){
                col++;
            }
        }

        System.out.println(col);
    }
    public static int coslov(String string){
        int count =1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==' '){
                count++;
            }

        }
        int num=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(i) == ' '){
                num++;
            }

        }
        System.out.println("Количество второй ="+ num);
        return count;
    }

}
