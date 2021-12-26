package com.company;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
//        Pattern  3:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=i;j++){
                System.out.print( k + "\t");
                j = (2) + (int)Math.pow(n, n+ 1);
                k++;
            }
            System.out.println();
        }
    }
}
