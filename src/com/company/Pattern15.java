package com.company;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
//        Pattern : controlling row and column value.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;
        int sp = n/2;
        int v = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = v;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval +"\t");
                if (j <= st/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            if(i <= n/2){
                sp--;
                st+=2;
                v++;
            }else{
                sp++;
                st-=2;
                v--;
            }

            System.out.println();
        }
    }
}
