package day_09_Operators;

import java.util.Scanner;

public class C2_BedenKitleIndeksi {
    public static void main(String[] args) {
        //Kullanıcıdan boy kilo alın
        //beden kitle indeksini hesap edin
        //kilo / (boy(m)*boy(m))
        Scanner sc = new Scanner(System.in);

        System.out.print("Kilonunuzu girin : ");
        int kilo = sc.nextInt();
        System.out.print("Boyunuzu giriniz : ");
        double boy = sc.nextDouble();
        double index = kilo / (Math.pow(boy,2));
        System.out.println("Beden kitle indeksiniz : "+index);

    }
}
