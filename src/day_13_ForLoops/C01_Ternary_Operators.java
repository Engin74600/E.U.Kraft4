package day_13_ForLoops;

import java.util.Scanner;

public class C01_Ternary_Operators {
    public static void main(String[] args) {
//kullanıcıdan sayı alacaz
        // çiftse çift yazacak
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int x = sc.nextInt();
        if (x%2==0){
            System.out.println("bu sayı çifttir");
        }else{
            System.out.println("bu sayı tektir");
        }
        System.out.println("----Trenary-------");

        System.out.println(x%2==0? "çift sayı":"Tek Sayı");
        //veya
        String resault =(x%2==0? "çift sayı":"Tek Sayı");
        System.out.println(resault);

    }
}
