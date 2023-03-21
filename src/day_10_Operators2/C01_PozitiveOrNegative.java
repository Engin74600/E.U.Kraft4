package day_10_Operators2;

import java.util.Scanner;

public class C01_PozitiveOrNegative {
    public static void main(String[] args) {
        //Create a class called C01_PositiveAndNegative,
        // and  write a program that can identify
        // if the user entered number is
        // positive, or negative or zero.
        //
        //            Ex:
        //                number = 200
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girimiz : ");
        int x = sc.nextInt();
        boolean isPozitive = x >0 ;
        System.out.println("is Pozitive number = " + isPozitive);
        boolean isNegative = x <0;
        System.out.println("is Negative number = " + isNegative);
        boolean isZero = x==0;
        System.out.println("is Zero number = " + isZero);


    }
}
