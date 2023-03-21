package my_litte_notbook;

import java.util.Scanner;

public class ScannerNexLinePromlem_Day08 {
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
        //gelen ilk nextLine'ı , muhtemelen çağrılan Scanner sınıfı kapandığı için görmüyor
        //o yüzden boş bi Scanner sc objesi yamakla
        sc.nextLine();
        //veya Scanner sc1 = new Scanner(System.in) ile farklı bi obje ile aktifleşme gerekir

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
