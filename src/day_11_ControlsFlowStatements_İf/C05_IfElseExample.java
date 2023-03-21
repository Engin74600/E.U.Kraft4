package day_11_ControlsFlowStatements_İf;

import java.util.Scanner;

public class C05_IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*
        //fizik kimya ve matematik notlarını konsoldan alsın
        //ortalama 80 üzerinde ise geçti yazsın
        // 80 ve altında ise kaldınız yazsın
       */
        System.out.println("Ders notlarını girin");
        System.out.print("Matematik :");
        double m = sc.nextDouble();
        System.out.print("Fizik : ");
        double f = sc.nextDouble();
        System.out.print("Kimya : ");
        double k = sc.nextDouble();
        double gecmenot = 80;
        double orta = (m+f+k)/3;
        if (orta>=gecmenot){
            System.out.println("Tebrikler! Sınıfı "+orta+" ile geçtiniz.");
        } else {
            System.out.println("Üzgünüz! Sınıfta "+orta+" ile kaldınız");
        }
    }
}
