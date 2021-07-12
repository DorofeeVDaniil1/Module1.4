package com.company.Methods;

import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1= in.nextInt(),y1= in.nextInt(),x2= in.nextInt(),y2= in.nextInt(),x3= in.nextInt(),y3= in.nextInt();
        System.out.println(trianglePerimetr(x1,y1,x2,y2,x3,y3));

    }
    public static double segmentLength(int x1, int y1, int x2, int  y2){
        double res=0;
        res=Math.sqrt((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1)));
        return res;

    }
    public static double trianglePerimetr(int x1, int y1, int x2, int  y2,int x3,int y3){
        double perimetr = 0;
        perimetr= segmentLength(x1,y1,x2,y2)+segmentLength(x2,y2,x3,y3)+segmentLength(x1,y1,x2,y2);
        System.out.println(segmentLength(x1,y1,x2,y2));
        System.out.println(segmentLength(x2,y2,x3,y3));
        System.out.println(segmentLength(x1,y1,x2,y2));
        return perimetr;


    }
}

