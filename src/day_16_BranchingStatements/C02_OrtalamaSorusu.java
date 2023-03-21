package day_16_BranchingStatements;

import java.util.Scanner;

public class C02_OrtalamaSorusu {
    public static void main(String[] args) {
        //kullanıcıdan 2 sayı alın
        // toplanlarını yazdırın
        // şayet 25e eşit veya bütyükse dögüden çıksın
        Scanner sc =new Scanner(System.in);


        while (true) {
            System.out.println("2 sayı girin lütfen!");
            System.out.print("1. sayı : ");
            int sayi1 = sc.nextInt();
            System.out.print("2. sayı : ");
            int sayi2 = sc.nextInt();
            int top = sayi1+sayi2;
            if (top>=25){
                System.out.println("Toplam 25'e eşit v büyükse program biter");
                break;//contune dersek else girmeden başa döner
                //sonsuz döngü olur
            }else {
                System.out.println("Toplamları : "+top);
            }
        }
    }
}
