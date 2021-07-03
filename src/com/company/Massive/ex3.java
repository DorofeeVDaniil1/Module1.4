package com.company.Massive;

import java.util.Scanner;

    public class ex3 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),number=0;
        int arr[] =new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();

            }
            System.out.println("Введите число");
            int x = in.nextInt();
            for (int y :arr
                 ) {

                if (y==x){
                    System.out.println("Номер элимента= "+(number+=1));
                    break;
                }
                else if (number+1==arr.length){
                    System.out.println("NO");
                    break;
                }
                else {
                    number++;
                    continue;

                }


            }


    }
}
