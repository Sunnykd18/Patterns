package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Pattern 1:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}










