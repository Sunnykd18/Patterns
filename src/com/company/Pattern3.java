package com.company;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
//        Pattern 3:

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = 0;
        int star = n;
        for (int i = 1; i <= n; i++) {
//            System.out.print(sp + ","+ star);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j  = 1; j <= star; j++){

                System.out.print("*\t");
            }


            sp++;
            star--;
            System.out.println();
        }

    }
}
