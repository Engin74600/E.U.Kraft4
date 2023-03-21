package day_10_Operators2;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1. write a program that can swipe two variables'
value by using a temporary variable
            Ex:
                if a= 10, b=15
            output:
                a = 15
                b = 10
         */
        System.out.println("A için tam bir sayı girin");
        int a = sc.nextInt();
        System.out.println("B için tam bir sayı girin");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("a = " + a+"\nb = " + b);


    }
}
