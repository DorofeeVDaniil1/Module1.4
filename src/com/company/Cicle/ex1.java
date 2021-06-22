package com.company.Cicle;

import java.util.Scanner;

    public class ex1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();

            int count = 0;
            while (true) {
                if (x-y<0) break;
                else {
                    x=x-y;
                    count++;
                    //System.out.println(x);
                }


            }
            System.out.println(count+" "+x);


        }
    }
