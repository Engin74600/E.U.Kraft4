package day_10_Operators2;

import java.util.Scanner;

public class HWork02_Cigarette {
    public static void main(String[] args) {
        /*Get name and age from the user, declare a variable (byte) age,
                write a program that can check if the
        person is eligible to buy Cigarettes. In USA it is illegal to sell
        tabacco under age 21.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen ad-soyad giriniz : ");
        String adSoyad = sc.nextLine();
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = sc.nextInt();
        boolean controlAge = yas >=21;
        System.out.println(adSoyad+" is eligible to buy cigarettes: " +controlAge);




    }
}
