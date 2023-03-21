package day_12_CFS_Switch;

import java.util.Scanner;

public class C01_If_Else_Example {
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
        System.out.println(" Lütfen 2 sayı girin :");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Lütfen bir işlem seciniz +,-,*,/");
        String islem = sc.nextLine();
        if (islem.equals("+")){
            System.out.println(x+y);
        } else if (islem.equals("-")){
            System.out.println(x-y);
        } else if (islem.equals("*")){
            System.out.println(x*y);
        }else if (islem.equals("/")){
            System.out.println(x/y);
        } else {
            System.out.println("Hatalı işlem");
        }
    }
}
