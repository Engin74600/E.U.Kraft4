package day_08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerNexLinePromlem {
    public static void main(String[] args) {
//      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

    Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen İsminizi giriniz");
        String isim = sc.nextLine();
        System.out.println("Lütfen soyisiminizi giriniz");
        String soyisim = sc.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= sc.nextInt();// int gibi sayısal primitive typlerdan sonra
        //gelen ilk nextLine'ı , normal bi string gibi görmüyor.
        //o yüzden araya boş bir nextline koymak gerekir
        sc.nextLine();

        System.out.println("Lütfen doğum yerinizi giriniz");
        String dogumYeri = sc.nextLine();

        System.out.println("İsminiz : " + isim);
        System.out.println("Soyisim : " + soyisim);
        System.out.println("Yaşınız = " + yas);
        System.out.println("Dogum Yeriniz : " + dogumYeri);
        System.out.println("Kaydınız başarıyla tamamlandı\n\n");
        System.out.println("İsminiz : " + isim+"\nSoyisim : " + soyisim+
                "\nYaşınız = " + yas+"\nDogum Yeriniz : " + dogumYeri+"\nKaydınız başarıyla tamamlandı");



    }
}
