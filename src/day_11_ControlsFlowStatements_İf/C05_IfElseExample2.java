package day_11_ControlsFlowStatements_İf;

import java.util.Scanner;

public class C05_IfElseExample2 {
    public static void main(String[] args) {
        System.out.println("A");
        if (true){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
        System.out.println("D"); //true ABD
//hava sıcaklığı 20 derece altı ise hava soğuk yazsın
        //20 ve üzeri ise hafa sıcak yazsın

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Hava sıcaklığı ne kadar :");
        double sicak = sc.nextDouble();
        double idealsicak = 20;
        if (sicak>=idealsicak){
            System.out.println("Hava sıcak ");
        }else {
            System.out.println("Hava soğuk");
        }*/
        // kullanıcıdan bir tam sayı alın
        //ekrana tek mi çift mi yazdırın

        System.out.print("Bir tam sayı giriniz : ");
        int x = sc.nextInt();
        boolean t = x%2==0;
        if (t){
            System.out.println("Girdiğiniz sayı çifttir");
        }else {
            System.out.println("Girdiğiniz sayı tektir");
        }

    }
}
