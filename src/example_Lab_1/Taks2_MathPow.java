package example_Lab_1;

import java.util.Scanner;

public class Taks2_MathPow {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen sayı ve katsayı giriniz");
        int a = sc.nextInt();
        int b =sc.nextInt();

        mathPow(a,b);

    }
    /**
     * A method that calculates the result by accepting the first of the numbers as the base and the second as the power.
     * @param sayi
     * @param katsayi
     */
    public static void mathPow(int sayi,int katsayi){

        int sonuc=1;
        for (int i = 1; i <=katsayi; i++) {
            sonuc*=sayi;
        }
        System.out.println("Sonuç = " + sonuc);
    }

}
