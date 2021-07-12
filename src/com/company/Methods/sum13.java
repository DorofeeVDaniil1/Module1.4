package com.company.Methods;

import java.util.Scanner;

public class sum13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SumOfThirteen(n);
        
    }
    public static void SumOfThirteen (int n){
        int count=0;
        for (; n >0 ; n--) {
            int c=n;
            int res=0;

            //пробегаемся по числу,чтобы посчитать сумму цифр в числе
            for (; c>0 ; c/=10) {

                res+=c%10;

            }
            //если сумма цифр в числе прибавляем 1
            if (res==13){
                count++;
            }


        }
        System.out.println("количество чисел = "+count);

    }
}
