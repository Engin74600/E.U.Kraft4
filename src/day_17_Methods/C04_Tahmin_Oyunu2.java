package day_17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C04_Tahmin_Oyunu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();//rast gele sayı  dail ettik

        int x = random.nextInt(51); //rast gele sayının 0-50 dahil ve arası
        //olmasını sağladık
        System.out.println("Beş hakkın var. Hadi 0-50 arasında tuttuğum sayıyı bul! ");
        int i = 0; //tahmin sayısı için
        boolean bl = true; //while döngüsünün süreklilik şartı için
        while (bl) {

            System.out.print(i + 1 + ". Tahmin : ");
            int y = sc.nextInt();
            if (x == y) {
                System.out.println("Tebrikler,buldunuz");
                bl = false;//doğru tahminden sonra while döngüsünden çıkmak için
            } else if (y > x) {
                System.out.println("Tuttuğum rakam daha küçük.");
                i++;// while döngüsünün/tahminin sayısının ilerlemesi için
            } else {
                System.out.println("Tuttuğum rakam daha büyük");
                i++;

            }
            if (i == 5) {// bu da tahmin sayısının şartı. kaldırısajk,
                // şart koymazsak yani if kaldırısak döngü tahmin tutatana kadar devam eder
                System.out.println("Tuttuğum sayı :" + x + " \nMaalesef bulamadınız. Başka sefere :)");
                bl = false;//5 tahminden sonra while döngüsünden çıkmak için
            }
        }
    }
}
