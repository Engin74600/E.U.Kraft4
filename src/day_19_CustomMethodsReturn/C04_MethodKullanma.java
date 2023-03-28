package day_19_CustomMethodsReturn;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("10dan küçük 2 pozitif tam sayı girin");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println(adding(num1, num2));
        // veya hocanın yaptığı
        int sonuc = C03_Faktoriyel.faktoriyelHesaplama(num1)+C03_Faktoriyel.faktoriyelHesaplama(num2);
        //          class adı     .  method adı (kullanıcıdan alınan sayı)
        System.out.println("Sonuç = " + sonuc);

    }
    //kullanıcıdan 10'dan küçük pozitif 2 tam sayı alsınm
    // fakröriyel değerlerini toplasın.
    public static int faktoriyelHesaplama(int sayi){
        int faktoriyel=1;
        for (int i = 1; i <=sayi ; i++) {
            faktoriyel*=i;
        }
        return faktoriyel;
    }
    public static int adding(int num1,int num2){


        int result = faktoriyelHesaplama(num1)+faktoriyelHesaplama(num2);
        return result;
    }
}
