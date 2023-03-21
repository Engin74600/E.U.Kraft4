package day_12_CFS_Switch;

import java.util.Scanner;

public class HWork_5_25_50 {
    public static void main(String[] args) {
     /*
       TASK
• Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını
denetimini yapın. Eğer sayı 5 den büyükse 5 den büyük
olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5
hem 25 den büyük olduğunu konsola yazdırın. Sayı 25 den
kücük 5 den büyükse sayının 5 den büyük ancak 25 den
küçük olduğunu yazdırın
      */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayi = sc.nextInt();
        if (sayi>50) {
            System.out.println("50'den büyük");
        } else if (sayi>25) {
            System.out.println("sayı 5 ve 25'ten büyük");
        } else if (sayi>5&&sayi<25){
            System.out.println("sayı 5ten büyük ama 25'ten küçük");
        }
    }
}
