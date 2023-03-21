package mentöring;

import java.util.Scanner;

public class Day05_RelationalOperators {
    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        // a b' ye eşittir ==
        System.out.println( "a b'ye eşit mi?"+(a==b));

        // a b' ye eşittir değildir !=
        System.out.println( "a b'ye eşit mi?"+(a!=b));

        // a b'den küçüktü  a<b
        System.out.println( "a b'den küçük mü?"+(a<b));

        // a b' den büyüktür a>b
        System.out.println( "a b'den büyük mü?"+(a>b));

        // a b'den küçük eşittir a<=b
        System.out.println( "a b'ye küçük eşit mi?"+(a<=b));

        // a b'den büyük eşittir a<=b
        System.out.println( "a b'ye büyük eşit mü?"+(a>=b));

        // Girilen 3 basamaklı bir sayının basamaklarına
        // göre tersini bir sayı olarak ekrana yazdırınız
        Scanner sc = new Scanner(System.in);

        int x = 2;
        int y = 5;
        int z = 6;

        int r = x *(y+z);

        System.out.println("Üç basamaklı Bir sayı Girin : ");
        //435 -->
        int sayi = sc.nextInt();
        int birler = sayi%10;
        System.out.println("birler = " + birler);
        int onlar = (sayi/10)%10;
        System.out.println("onlar = " + onlar);
        int yuzler = sayi/100;//4
        System.out.println("yuzler = " + yuzler);
        int yenisayi=birler*100+onlar*10+yuzler;
        System.out.println("yenisayi = " + yenisayi);
        String girilenBilgi = "65"; // şu haliyle ahet gibi bir kelimedir. sayısal işleme giremez
        int girilenSayi=65;

        /*// Kelimenin sayıya çevrilmesi
        int girilenBilgininSayiHali = Integer.parseInt(girilenBilgi); // dönüşecek tipe uygun dönüşüm
        short shortDeger = Short.parseShort(girilenBilgi);

        double oran = Double.parseDouble(girilenBilgi);

        // Sayının kelimeye çevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // değişiikenin tipine uygun dönüşüm
        String kelimeOran = Double.toString(oran);*/
        String birlerStr = Integer.toString(birler);
        String onlarStr = Integer.toString(onlar);
        String yuzlerStr = Integer.toString(yuzler);
        System.out.println(birlerStr+onlarStr+yuzlerStr);
    }
}
