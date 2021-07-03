package com.company.Massive;

import java.util.Scanner;

public class Popular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt(), arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int count = 1;
        int colpovtorov;
        int popular = arr[0];
        int eliment;
        for (int i = 0; i < arr.length-1; i++) {
            eliment = arr[i];
            colpovtorov=0;
            for (int j = 1; j <arr.length ; j++) {
                if (arr[j]== eliment){
                    colpovtorov++;
                }

            }
            if (colpovtorov>count ){
                popular= eliment;
                count= colpovtorov;

            }

        }
        System.out.println(popular);



    }
}
