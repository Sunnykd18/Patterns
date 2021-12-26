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
//        Pattern 2:

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
        Pattern 3:

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
//        Pattern 4:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n / 2;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for (int j  = 1; j <= st; j++){

              System.out.print("*\t");
            }
            if(i <= n / 2){
                sp--;
                st += 2;
            }else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }



      pattern  5:
*	*	*		*	*	*
*	*				*	*
*						*
*	*				*	*
*	*	*		*	*	*

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = n / 2 + 1;
        int sp = 1;

        for (int i = 1;i <= n; i++){
//            System.out.print(st +","+ sp + ","+ st);
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                st--;
                sp += 2;
            }else{
                st++;
                sp -=2;
            }
            System.out.println();
        }
Pattern 7:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                if (i == j){
                   System.out.print("*\t");
                }
                else {
                   System.out.print("\t");
                }
            }
            System.out.println();

        }
        Pattern 8:
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
*/


/* Pattern 9
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
*/
/*
        Pattern 10:
/  Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int os = n / 2;
        int is = -1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= os; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }
            if(i > 1 && i < n){
                System.out.print("*\t");
            }
            if(i <= n/2){
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }

             System.out.println();
        }/
        Pattern using Numbers:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
        Pattern 2: fibo + triangle
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;

            }
            System.out.println();
        }
        Pattern  3:
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
*/

/*
Pattern :  - pascal traiangle
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();

 for (int i = 0; i < n; i++ ){
     int icj = 1;
     for(int j = 0; j <= i ; j++) {
         System.out.print( icj +"\t");
         int icjpl1 = icj * ( i - j)/ (j + 1);
         icj = icjpl1;
     }
     System.out.println();
 }

        Pattern : - Table
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for (int i = 1; i<= 10; i++){
            int v = x * i;
            System.out.println(x + "*" + i +"="+ v);
        }
*/

/*
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
        Pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;

        int sp = 2 * n - 3;
        int v = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print( v + "\t");
                v++;

            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n){
                st--;
                v--;
            }
            for (int j = 1; j <= st; j++) {
                v--;
                System.out.print(v +"\t");
            }

            st++;
            sp -= 2;

            System.out.println();
        }
*/


/*
        pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 1;
        int sp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }

            System.out.println();
        }
*/

/*
       Pattern: sand clock
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();

 int st = n;
 int sp = 0;
 for (int i = 1; i <= n; i++){
     for(int j = 1; j <= sp; j++){
         System.out.print("\t");
     }
     for(int j = 1; j <= st; j++){
         if(i> 1 && i <= n/2 && j > 1 && j < st){
             System.out.print("\t");
         }else {
             System.out.print("*\t");
         }
     }
     if(i <= n/2){
         sp++;
         st-=2;
     }else{
         sp--;
         st+=2;
     }

     System.out.println();
 }



        Pattern: swastik
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
 for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= n; j++){
         if (i == 1) {
             if (j == n || j <= n / 2 + 1) {
                 System.out.print("*\t");
             } else {
                 System.out.print("\t");
             }
         } else if (i <= n / 2) {
             if (j == n || j == n / 2 + 1) {
                 System.out.print("*\t");
             } else {
                 System.out.print("\t");
             }
         } else if (i == n / 2 + 1) {
             System.out.print("*\t");
         }else if (i < n) {
             if(j == 1 || j == n/2+1){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }

         } else {
             if(j == 1 || j >= n/2+1){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }
         }

     }
     System.out.println();
 }
*/

/*
        Pattern : " W " in star given no. as n:
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1;i <= n; i++){
            for (int j = 1 ;j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print("*\t");

                }
                else if( i > n / 2 && (i == j || i + j == n + 1)){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
*/
    }
}










