package com.company.Cicle;

import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //обьявим переменные
        int a = in.nextInt(),count= in.nextInt(),sum=0;

        //Б-счетчик

        //условие если одно из чисел равно нулю
        if (a==0){
            System.out.println(0);
        }
        else if (count==0){
            System.out.println(0);
        }
        else {
            //Цикл для сложения
            while (count != 0) {
                sum += a;
                count--;
            }
        }
        System.out.println(sum);


    }
}
