package day_09_Operators;

import java.util.Scanner;

public class C1_BoyKilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Boy uzunluğunuzu girin : ");
        double boy = sc.nextDouble();
        System.out.println("Kilonuzu girin : ");
        double kilo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Lütfen isminizi girin : ");
        String isim = sc.nextLine();

        System.out.println("Soy isminizi girin : ");
        String soyisim = sc.nextLine();

        System.out.println("Boyunuz : "+boy+" m,\nKilonuz : "+kilo+" kg.");

        // Scanner.next() ilk boşluk bosluga kadar olan degerleri alir
        // Scanner.nextLine() ilk entere kadar olan degferleri aliyor


    }
}
