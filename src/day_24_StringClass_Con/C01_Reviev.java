package day_24_StringClass_Con;

import java.util.Scanner;

public class C01_Reviev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İsminizi girin");
        String isim=sc.nextLine();
        //ismin son harfini almak için
        //" Yavuz Selim "

        System.out.println(isim.charAt(isim.length() - 1));
        System.out.println("\n-------equals()-------\n");
        System.out.println(isim == " Yavuz Selim "); // false referanslar farklı
        System.out.println(isim.equals(" Yavuz Selim "));//true
        System.out.println(isim.equalsIgnoreCase("engin ulus"));
        // büyük küçük harfi gözardı eder.
        System.out.println("\n-------toLowerCase()-------\n");
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        System.out.println(isim);
        System.out.println("\n-------trim()-------\n");
        System.out.println(isim.trim());
        System.out.println(isim);
        System.out.println("\n-------indexOf()-------\n");
        System.out.println(isim.indexOf("s"));
        System.out.println(isim.indexOf("Yavuz"));
        System.out.println(isim.indexOf("E"));
        System.out.println(isim.lastIndexOf("s"));

        int ilkendeks= isim.indexOf("");

        System.out.println("\n-------replace()-------\n");



    }
}
