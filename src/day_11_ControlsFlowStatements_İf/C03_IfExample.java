package day_11_ControlsFlowStatements_İf;

import java.util.Scanner;

public class C03_IfExample {
    public static void main(String[] args) {
        //alinin fizik 50, kımya 30
        // ortalama 50 üzeri ise geçti yazsın
        // değilse bişey yazmasın
        double fizik = 50;
        double kimya = 55;
        double ort = (fizik+kimya) /2;
        /*veya
        boolen result = (ort/2)
        if(result) {........

        veya
        if ( (fizik+kimya)/2){......
        ama bu tavsiye edilmez

        veya
        double gecmenotu =50
        if(ort>=gecmenotu) {....
        en güzeli ve temizi

         */
        if (ort>=50){
            System.out.println("Ali sınıfı "+ort+" ile geçti");
        }
        System.out.println("------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ders notlarını girin");
        System.out.print("Fizik : ");
        double f = sc.nextDouble();
        System.out.print("Kimya : ");
        double k = sc.nextDouble();
        System.out.print("Geçme notu : ");
        double gecmenot = sc.nextDouble();
        double orta = (f+k)/2;
        if (orta>=gecmenot){
            System.out.println("Tebrikler! Sınıfı "+orta+" ile geçtiniz.");
        }

    }
}
