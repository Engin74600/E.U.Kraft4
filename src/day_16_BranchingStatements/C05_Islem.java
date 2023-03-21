package day_16_BranchingStatements;

import java.util.Scanner;

public class C05_Islem {
    public static void main(String[] args) {

        //yapmak istediği işlemin menüsünü ile isteyin
        // kullanıcıdan 2 sayı alın
        //isteğine göse işlemi akrana yazdırın
        //sonra devam için 1 çıkış için 0
        Scanner sc =new Scanner(System.in);

        islem :while (true){
            System.out.println("Yapmak istediğiniz işlemi seçin : ");
            System.out.println("Toplama 1\nÇıkarma 2\nÇarpma  3\nBölme   4");
            int tercih = sc.nextInt();
            if (tercih==1){
                while (true){
                    System.out.println("lütfen 2 sayı girin");
                    System.out.print("1. sayı : ");
                    int x = sc.nextInt();
                    System.out.print("2. sayı : ");
                    int y = sc.nextInt();
                    System.out.println("Toplama işleminin sonucu : "+(x+y));
                    System.out.println("\n\tİşleme devam 1 \n\tMenüye dönme 2\n\tÇıkış yapma  0");
                    int tercih2 = sc.nextInt();
                    if (tercih2==1){
                        continue;
                    }else if (tercih2==0){
                        break islem;
                    }else if (tercih2==2){
                        continue islem;
                    }else {
                        System.out.println("yanlış bir işlem");
                        break;
                    }

                }
            } else if (tercih==2) {
                while (true) {
                    System.out.println("lütfen 2 sayı girin");
                    System.out.print("1. sayı : ");
                    int x = sc.nextInt();
                    System.out.print("2. sayı : ");
                    int y = sc.nextInt();
                    System.out.println("Çıkarma işleminin sonucu : " + (x + y));
                    System.out.println("\n\tİşleme devam 1 \n\tMenüye dönme 2\n\tÇıkış yapma  0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 == 1) {
                        continue;
                    } else if (tercih2 == 0) {
                        break islem;
                    } else if (tercih2 == 2) {
                        continue islem;
                    } else {
                        System.out.println("yanlış bir işlem");
                        break;
                    }

                }
            } else if (tercih==3) {
                while (true) {
                    System.out.println("lütfen 2 sayı girin");
                    System.out.print("1. sayı : ");
                    int x = sc.nextInt();
                    System.out.print("2. sayı : ");
                    int y = sc.nextInt();
                    System.out.println("Çarpma işleminin sonucu : " + (x + y));
                    System.out.println("\n\tİşleme devam 1 \n\tMenüye dönme 2\n\tÇıkış yapma  0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 == 1) {
                        continue;
                    } else if (tercih2 == 0) {
                        break islem;
                    } else if (tercih2 == 2) {
                        continue islem;
                    } else {
                        System.out.println("yanlış bir işlem");
                        break;
                    }

                }
            }else if (tercih==4) {
                while (true) {
                    System.out.println("lütfen 2 sayı girin");
                    System.out.print("1. sayı : ");
                    int x = sc.nextInt();
                    System.out.print("2. sayı : ");
                    int y = sc.nextInt();
                    int result;
                    if (y!=0){
                        result=x/y;
                    } else {
                        result=0;
                    }
                    System.out.println("Bölme işleminin sonucu : " + result);
                    System.out.println("\n\tİşleme devam 1 \n\tMenüye dönme 2\n\tÇıkış yapma  0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 ==1) {
                        continue;
                    } else if (tercih2 == 0) {
                        break islem;
                    } else if (tercih2 == 2) {
                        continue islem;
                    } else {
                        System.out.println("yanlış bir işlem");
                        break;
                    }

                }
            }else {
                System.out.println("hatalı bi işlem yaptınız");
                break;
            }
        }
        System.out.println("Çıkış yapıldı!");

    }
}
