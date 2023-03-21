package my_litte_notbook;

import java.util.Scanner;

public class String_HarfAlma_Day13 {
    public static void main(String[] args) {
        String name = "Ali";
        // harf sırası 012
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));


        //öRNEK SORU ÜZERİNDEN

        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");
        char harf = sc.next().charAt(0); // scanner sınıfı ile harf alamıyoruz
        //sc.next() ile String aldık
        //charAt(0) ile bu aldığımız keilmenin ilk harfini almış olduk
        if (harf == 'p' || harf =='P'){
            System.out.println("Pazar, Pazartesi, Perşembe");
        }else if (harf == 'S' || harf == 's'){
            System.out.println("Salı");
        }else if (harf == 'c' || harf == 'C'){
            System.out.println("Çarşamba,Cuma, Cumartesi");
        } else {
            System.out.println("geçersiz harf");
        }
    }
}
