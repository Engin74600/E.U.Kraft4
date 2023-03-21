package day_13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {
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
        System.out.println("---------------");

        switch (harf){
            case's','S':
            System.out.println("salı");
            break;
            case'p','P':
                System.out.println("perşembe,pazar, pazartesi");
                break;
            case'c' :
            case 'C':
                System.out.println("Çarşamba, cuma, cumartesi");
                break;
            default:
                System.out.println("Yanlış bir harf gieidinzi.");
        }




    }
}
