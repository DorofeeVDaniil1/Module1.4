package com.company.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class edu1 {
    public static void main(String[] args) {
        int temp = func(3,4);
        System.out.println(temp);
         func1(3,4);//Для void
        System.out.println(Arrays.toString(readArray()));


    }
    public static int func(int a , int b){ //напиши static и public чтобы ссылаться на фунуцию
        int result = 1;
        for (int i = 0; i < b; i++) {
            result*=a;

        }
        return result;
    }
    static void func1 (int a, int b){//указывай парметр void (нужно чтобы только выводиь , ничего не возвращает)

        int res =1;
        for (int i = 0; i < b; i++) {
            res*=a;

        }
        System.out.println(res);

    }
    public static int [] readArray(){//Получение из функиции массива
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        return arr;

    }
}

