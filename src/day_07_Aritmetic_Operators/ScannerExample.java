package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("2 üzeri 5 = "+Math.pow(2,5));
        System.out.println("25in kare kökü :"+Math.sqrt(25));
        Scanner sc = new Scanner(System.in);
        //sc yazılan yere ne yazıldığı önemli değil
        // bu bir kalıp
        // vew ve sonrası yeni obje oluşturma.
        // yazılar ilk yazdığında kırmızı olursa üzerine gelin
        // import class yapın

        /*System.out.println("----STRİNG---\n");
        System.out.println("Lütfen bir kelime giriniz :");
        String str = sc.nextLine();
        System.out.println("Girilen kelime : "+str);

        System.out.println("\n----INT---\n");
        int kimya = sc.nextInt();
        System.out.println("kimya = " + kimya);
        int fizik = sc.nextInt();
        System.out.println("fizik = " + fizik);
        int ortalama = (fizik+kimya)/2;
        System.out.println("ortalama = " + ortalama);
        /*Ali’nin doğum yılını kullanıcıdan alarak yaşını ekrana getiren
        programı yazınız?*/
        /*System.out.println("Doğum yılını girin");
        int yil = sc.nextInt();
        int yas = 2023-yil;
        System.out.println("Yas  :"+yas);*/

        System.out.println("Sırasıyla fizik kimya ve matematik ders notu girin");
        double fi = sc.nextDouble();
        double ki = sc.nextDouble();
        double ma = sc.nextDouble();
        double ort = (fi + ki + ma) / 3;
        System.out.println("ortalama = " + ort);
        System.out.println("--------------\nExample 6.2\n");
        boolean sonuc = ort > 80;
        System.out.println("Ali sınıfı geçti mi : " + sonuc);


    }
}
