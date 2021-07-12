package com.company.Striger;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

       lengter(string);

    }
//    public static int colslov(String string){
//        int count=0;
//        if (string.length()!=0){
//            count++;
//        }
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i)==' '){
//                count++;
//            }
//        }
//        return count;
//    }
    public static void lengter (String string){
        int col=1;
        int temp1=0;
        String item="";
        String itemmax=string.substring(0);

        for (int i = 0; i < string.length(); i++) {


            if (string.charAt(i)!= ' '){
                temp1++;
                item+=string.charAt(i);
            }
            if (string.charAt(i)==' '){
                if(temp1==col){
                    itemmax=string.substring(0);
                }

                }
                if (temp1>col){
                    col=temp1;
                    temp1=0;
                    itemmax=item;
                    item="";
                }

                else {
                    temp1=0;
                    item="";
                }
        }
        System.out.println(itemmax+"\n"+col);



    }



}



