package com.company.Cicle;

import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NumberBridge = in.nextInt();
        int coint= 0;
        int bus = 437;
        while(coint!=NumberBridge){

            coint++;

            int bridge = in.nextInt();
                if (bus<=bridge){
                    if (coint>=NumberBridge){
                        System.out.println("No crash");
                    }
                    else {
                        continue;
                    }
                }
                else if (bus>bridge){
                    System.out.println("Crash "+(coint));
                    break;
                }



        }





    }

}
