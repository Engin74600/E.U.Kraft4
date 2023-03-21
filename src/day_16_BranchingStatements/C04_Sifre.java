package day_16_BranchingStatements;

import java.util.Scanner;

public class C04_Sifre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sifre ="Harun123";
        int i=0;
        System.out.println("5 Hakkın var!");
        while (i<5){
            System.out.println(i+1+". Tahmin : ");
            String tahmin = sc.nextLine();
            if (tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==5){//5. tahminden sonra "tekrar dene" çıkmaması için
                //buraya bu şartı koyduk ki program sonlansın
                System.out.println("hakkınız doldu");
                break;
            }
            System.out.println("Hatalı şifre. Tekrar deneyiniz");

        }
        /* veya
        String sifre ="Harun123";
        int i=0;
        boolean flag=true
        System.out.println("5 Hakkın var!");
        while (flag){
            System.out.println(i+1+". Tahmin : ");
            String tahmin = sc.nextLine();
            if (tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==5){//5. tahminden sonra "tekrar dene" çıkmaması için
                //buraya bu şartı koyduk ki program sonlansın
                System.out.println("hakkınız doldu");
                flag=false
                contunie;
            }
            System.out.println("Hatalı şifre. Tekrar deneyiniz");

        }
         */


    }

}
