package day_11_ControlsFlowStatements_İf;

import java.util.Scanner;

public class HWorkEnBuyukSayi {
    public static void main(String[] args) {
        /*
        //Bir program yazın
// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
// 2 veya 3 farklı yol ile çözmeye çalışın
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("3 tane tam sayı giriniz:");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();

        System.out.println("\n-----1.yol----\n");

        System.out.println("max değer : " +(Math.max(Math.max(a,b),c)));
        // üç değerli olmuyor. o yüzden önce içteki math.max ile 2 değer
        // sonra onun sonucunu diğer değeri kıyaslıyoruz
        // iç içe math.max ile
        /* bu iç içe yerine intler ,ile de olur
        inr first = Math.max(a,b);
        int max = Math.max(first,c);
        Sysytem.out.println("max = "+max)
         */

        System.out.println("\n-----2.yol----\n");
        if (a > b && a > c) {
            System.out.println("Büyük sayı : " + a);
        } else if (b > a && b > c) {
            System.out.println("Büyük sayı : " + b);
        } else if (c > a && c > b) {
            System.out.println("Büyük sayı : " + c);
        }else if (a == b || a == c || b == c) {
            if ((a==b) && a>=c ){
                System.out.println("Büyük sayı : " + a);
            }else if ((a==c) && a>=b){
                System.out.println("Büyük sayı : " + a);
            } else if ((c==b) && b>=a ){
                System.out.println("Büyük sayı : " + b);
            }
        }

        System.out.println("\n-----3.yol----\n");
        if (a >= b && a >= c) {
            System.out.println("Büyük sayı : " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Büyük sayı : " + b);
        } else if (c >= a && c >= b) {
            System.out.println("Büyük sayı : " + c);
        }

        System.out.println("\n-----4.yol----\n");
        /* Şayet herhangi 2 sayı büyük değerde eşit olursa
        2 defa yazdırıyor
        */
        if (a >= b && a > c || a >= c && a > b) {
            System.out.println("En büyük sayı : " + a);
        }
        if (b >= a && b > c || b >= c && b > a) {
            System.out.println("En büyük sayı : " + b);
        }
        if (c >= a && c > b || c >= b && c > a) {
            System.out.println("En büyük sayı : " + c);
        }
        if (a == b && a == c && b == c) {
            System.out.println("En büyük sayı : " + a);
        }

            System.out.println("\n-----5.yol----\n");
            // örnek bi çözümden
            int enbuyuksayi = a; //peşinen birini büyük dendi
            //diğer 2 sayının büyüklüğü adım adım kontrol edilecek
            if (b > enbuyuksayi) {
                enbuyuksayi = b;
            }
            if (c > enbuyuksayi) {
                enbuyuksayi = c;
            }
            System.out.println("En büyük sayı = " + enbuyuksayi);
   /*
        3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        //(min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız
        // 1 ,2,3   eşit sayı yok
        // 1,2,2    2
        // 2,2,2    2
        //2,3,2     2 (düzenlendi)

    */
        System.out.println("Üç sayı giriniz ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x==y){
            System.out.println(x);
        } else if (y==z) {
            System.out.println(y);
        } else if (z==x) {
            System.out.println(z);
        } else {
            System.out.println("Hiç bie eşitlik yok");
        }


    }
}