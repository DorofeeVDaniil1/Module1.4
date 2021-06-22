package com.company.Cicle;

import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //обьявим переменные
        int a = in.nextInt(),count= in.nextInt(),sum=0;

        //Б-счетчик
        //Цикл для сложения
        while (count != 0) {
            sum += a;
            count--;
        }

        System.out.println(sum);


    }
}
