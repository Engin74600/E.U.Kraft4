package day_08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTaks1 {
    public static void main(String[] args) {

        //kullanıcıdan sayı alın ve sayının karesini ayzdırın
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayi = sc.nextInt();
        System.out.println("Girilen sayının karesi "+(Math.pow(sayi,2)));
        //veya
        System.out.println("Girilen sayının karesi "+(sayi*sayi));
        //veya
        int sayiKare=sayi*sayi;
        System.out.println("Girilen sayının karesi "+sayiKare);
        sc.close();

    }
}
