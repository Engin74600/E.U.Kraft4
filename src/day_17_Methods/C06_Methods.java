package day_17_Methods;

import java.util.Scanner;

public class C06_Methods {
    public static void main(String[] args) {
        //aritmetikOrtalama();
        //buyuksayi();
        kiloOTokka();

    }

    public static void aritmetikOrtalama (){
        double x=3, y=5, z=10;
        double result = (x+y+z)/3;
        System.out.println("Ortalama : "+result);

    }
    public static void buyuksayi(){
        int a=5,b=7;
        int enbuyuk=0;

        if(a>b){
            enbuyuk=a;
        } else {
            enbuyuk=b;
        }
        System.out.println("Büyük sayı "+enbuyuk);
    }
    public static void kiloOTokka () {
        //Bir method yazın ve kiloyu okka cinsinden versin.
        //Okka=1.282 kg

        //Methodların içi methodlara ait;
        //buradaki bir deklarasyon, başka bi yerdekiyle çakışmaz
        Scanner sc = new Scanner(System.in);
        System.out.println("Okkaya çevrilmek istenen kilo ne kadar?");
        double kg = sc.nextDouble();
        double okka = kg / 1.283;
        System.out.println(okka + " okka");
    }
}
