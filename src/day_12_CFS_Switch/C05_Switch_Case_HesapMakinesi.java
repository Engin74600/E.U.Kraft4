package day_12_CFS_Switch;

import java.util.Scanner;

public class C05_Switch_Case_HesapMakinesi {
    public static void main(String[] args) {
/*
//+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 2 sayi girin :");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Bir işlem seçiniz +,-,*,/");
        String islem = sc.nextLine();
        switch (islem){
            case "+" :
                System.out.println(x+y);
                break;
            case "-" :
                System.out.println(x-y);
                break;
            case "*" :
                System.out.println(x*y);
                break;
            case "/" :
                System.out.println(x/y);
                break;
            default:
                System.out.println("Hatalı bir işlem yaptınız");
        }




    }
}
