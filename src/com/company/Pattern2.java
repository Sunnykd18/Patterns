package com.company;

import java.util.Scanner;

public class Pattern2 {
     public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            sp--;
            star++;
            System.out.println();
        }
    }
}
