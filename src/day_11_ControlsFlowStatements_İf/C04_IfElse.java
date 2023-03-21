package day_11_ControlsFlowStatements_İf;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ders notlarını girin");
        System.out.print("Fizik : ");
        double f = sc.nextDouble();
        System.out.print("Kimya : ");
        double k = sc.nextDouble();
        double gecmenot = 50;
        double orta = (f+k)/2;
        if (orta>=gecmenot){
            System.out.println("Tebrikler! Sınıfı "+orta+" ile geçtiniz.");
        } else {
            System.out.println("Üzgünüz! Sınıfta "+orta+" ile kaldınız");
        }
    }
}
