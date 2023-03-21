package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class task1_DaireAlanCevre {
    public static void main(String[] args) {
        //
        System.out.println("-------ÖDEV 1-----\n");

        //Ödev 1: Yarıçapı kullanıcıdan alarak dairenin
        // alanı ve çevresini hesaplayın?
        //(PI=3.14)
        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girniz: ");
        double PI = 3.14;
        double radius = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius,2);
        // veya
        double circleArea2 = PI*radius*radius;
        double circumference = 2*radius*Math.PI;
        //veya
        double circumference2 =2*PI*radius;
        System.out.println("Yarı çapı "+radius+
                " olan bir dairenin \n\talanı "+circleArea+
                " cm kare\n\tçevresi ise "+circumference+" cm'dir.");
    }
}
