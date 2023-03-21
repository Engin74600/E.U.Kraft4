package day_14_NestedWileDoWhile;

import java.util.Scanner;

public class C01_MinimumNumber {
    public static void main(String[] args) {
       // kullanıcıdan 5 sayı alın ve en küçünü yazdırın

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int min =Integer.MAX_VALUE;//İNT'İN EN YÜKSEK DEĞERİ alındı
        //çünkü ilk kıyasta girilen sayı n olursa olsun küçük kalsın diye
        System.out.println(min);
        for (int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num = sc.nextInt();// defa numara girilmesi icin
            //für badisi içine alındı
            if (num<min){//şart oalar kıyas yapıldı v max dğerle doğrulandı,
                //num değer her halukarda küçük
                min=num;//sonra her döngüde yeniden minimum değer olarak tanımlanacak
            }
        }
        System.out.println(min);


    }
}
