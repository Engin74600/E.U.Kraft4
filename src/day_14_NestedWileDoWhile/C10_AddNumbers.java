package day_14_NestedWileDoWhile;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {
    /*
          Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
        programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
        sağlanmalıdır.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int n= sc.nextInt();
        int sum=n;
        while (n!=0){
            System.out.println("Toplanmasını istediğiniz sayıyı giriniz");
            n= sc.nextInt();
            sum+=n;
        }
        System.out.println("Toplam = "+sum);
    }
}
