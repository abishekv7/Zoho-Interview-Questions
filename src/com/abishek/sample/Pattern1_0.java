package com.abishek.sample;

import java.util.Scanner;

public class Pattern1_0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = input.nextInt();
        int count = 0;
        //upper left side part
        for(int i = 1; i <= n/2; i++) {
            for(int j = 1; j <= i; j++) {
                if(j%2 == 1)
                    System.out.print("1");
                else
                    System.out.print("0");
            }

            for(int j = i; j < n/2; j++) {
                System.out.print(" ");
            }

            //upper right side part
            for(int j = n/2+1; j < n - count; j++) {
                System.out.print(" ");
            }
            count++;
            for(int k = 1; k <= i; k++) {
                if(k%2 == 1)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
        //lower left side part
        for(int j = 1; j <= n; j++) {
            if(j%2 == 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
        count = 0;
        for(int i = 1; i <= n / 2; i++) {
            for(int j = n/2; j >= i; j--) {
                if(j%2 == 1)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //lower right side part
            for(int k = n / 2 + 1; k < n / 2 + i; k++) {
                System.out.print(" ");
            }
            count++;
            for(int j = n/2+i; j < n; j++ ) {
                if(j%2 == 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
