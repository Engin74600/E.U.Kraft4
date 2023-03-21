package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class Task2_Fahrenheit {
    public static void main(String[] args) {

        System.out.println("-------ÖDEV 2-----\n");
        //Kullanıcıdan Fahrenheit değerini alarak Celsius değerini
        //ekrana yazdırın? (℃=(℉-32)/1.8)
        Scanner sc = new Scanner(System.in);
        System.out.println("Fahrenheit bir değer girin :");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)/1.8;
        System.out.println(fahrenheit+" fahrenheit "+celsius+" celsius'tur.");

    }
}
