package my_litte_notbook;

import java.util.Random;
import java.util.Scanner;

public class Method_Random_RastgeleSayıAlma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//yazdırma metodu dahil oldu
        Random random = new Random();//rast gele sayı  dail ettik

        int x = random.nextInt(51); //rast gele sayının 0-50 dahil ve arası
        //olmasını sağladık
        System.out.println("Hadi 0-50 arasında tuttuğum sayıyı bul! ");
        boolean bl = true; //while döngüsünün süreklilik şartı için
        while (bl) {

            System.out.print("Tahmin : ");
            int y = sc.nextInt();
            if (x == y) {
                System.out.println("Tebrikler,buldunuz");
                bl = false;//doğru tahminden sonra while döngüsünden çıkmak için
            }
        }
    }
}
