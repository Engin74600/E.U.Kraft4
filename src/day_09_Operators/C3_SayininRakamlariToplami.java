package day_09_Operators;

import java.util.Scanner;

public class C3_SayininRakamlariToplami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //// Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin
        System.out.println("Üç basamaklı pozirif tam bir sayı giriniz : ");
        int num = sc.nextInt(); // diyelim ki 141 ---> 1+4+2
        int lastDigit = num % 10; //2
        int totalOfDigits = lastDigit ;// 2

        num = num/10; // 14/10=1 (hafızadaki number:
        lastDigit = num %10; //14/10=4
        totalOfDigits = totalOfDigits+ lastDigit; //2+4


        num = num/10; //10/10=1
        lastDigit = num;
        totalOfDigits= totalOfDigits + lastDigit;//6+1=7
        System.out.println("Girilen sayının rakamları toplamı = "+totalOfDigits);


    }
}
