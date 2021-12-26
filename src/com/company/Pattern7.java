package com.company;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
//        Pattern 7:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
                if (i < n) {
                    sp--;
                }
                System.out.println();
            }

        }
    }
}
