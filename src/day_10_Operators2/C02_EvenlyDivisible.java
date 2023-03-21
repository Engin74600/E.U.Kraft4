package day_10_Operators2;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        C01_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5
         */
        System.out.println("Lütfen tam bir sayı giriniz : ");
        int x = sc.nextInt();
        boolean y = x%2==0;
        boolean z = x%3==0;
        boolean t = x%5==0;
        System.out.println(" Girilen "+x+" sayısının\n2'ye tam bölümü :"+y+
                "\n3'e tam bölümü : "+z+"\n5'e tam bölümü :"+t);


    }
}
