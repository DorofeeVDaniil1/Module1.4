package com.company.Circlein;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        String count=" ";


        while (true){
            int num = in.nextInt();

            count = count +" " + Integer.toString(num);
            if (num==0){
                break;
            }
            if (num>max){
                max=num;
            }


        }
        String max2 = Integer.toString(max);
        System.out.println("Строка "+count);
        int index = count.indexOf(max2);
        int find = 0;
        while (index != -1) {
            find++;
            count = count.substring(index + 1);
            index = count.indexOf(max2);
        }
        System.out.println(find);




    }
}
