package day_14_NestedWileDoWhile;

import java.util.Random;
import java.util.Scanner;

public class C07_Tahmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parola = "safak";
        int thakki=3;
        System.out.println("Parolayı Tahmin et!\n\t3 hakkın var.");
        /* FOR DÖNGÜSÜ İLE
        System.out.println("-------FOR DÖNGÜSÜ İLE");
        for (int i=1; i<=3; i++){
            String tahmin =sc.nextLine();
            if (parola.equals(tahmin)){//String ifadenin//
                //eşitlik kontrolu
                System.out.println("Harika! buldun");
                break;
            }else {
                System.out.println("Yanlış Tahmin\n\t"+
                        (thakki-i)+" hakkın kaldı");
            }
        }

          System.out.println("-------WHİLE DÖNGÜSÜ İLE----");
        */

        while (0<=thakki) {
            String tahmin = sc.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("Tebrikler! Parolayı bildinz.");
                break;
            } else {
                System.out.println("Parola yanlış.\nKalan hakkınız :"+(--thakki));
            }
        }
    }
}
