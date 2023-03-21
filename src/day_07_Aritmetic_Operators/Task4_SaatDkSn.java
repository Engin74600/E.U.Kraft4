package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class Task4_SaatDkSn {
    public static void main(String[] args) {
        System.out.println("-------ÖDEV 4-----\n");
        /*
        Ödev 4: Kullanıcıya saniye değerini girdirerek girilen saniye değerinin kaç saat kaç dakika
kaç saniye olduğunu ekrana yazan programı yazın?
(1 saat 60 dakika 1 dakika 60 sn)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Saniye değeri girin :");
        int topSn = sc.nextInt();
        int saat = 3600;
        int dk = 60;
        int tsaat = topSn / saat;
        int tdk = (topSn % saat) / dk;
        int tsn = topSn % dk;
        System.out.println(topSn + " sn, " + tsaat + " saat, " + tdk +
                " dk, " + tsn + " sn'dir");
    }
}
