package day_12_CFS_Switch;

import java.util.Scanner;

public class Hwork_SayıTahmin {
    public static void main(String[] args) {
   /*     TASK
        Konsoldan sayı alarak bir sayı tahmin programı
        yazın. Nested if yapısı kullanın. Tahmin sayıdan
        küçük ama yakınsa(sayının yarı değerinden daha yakın) veya
        çok küçükse uygun bir mesaj versin. Tahmin sayıdan
        büyük, ancak yakın veya uzak ise buna uygun
        mesajlar versin. Elbette isabetli tahmin de bir tebrik
        mesajı yazdırın.(ev ödevi)
    */
        int tutulansayi = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Haydi! 1 ila 10(dahil) arası tuttuğum sayıyı bul");
        int tahminsayi = sc.nextInt();
        if (tahminsayi == tutulansayi){
            System.out.println("Tebrikler. Doru bildiniz.");
        } else if (tahminsayi>0 && tahminsayi<11 ){
            if (tahminsayi>=(tutulansayi/2) && tahminsayi<=(tutulansayi*1.5) ){
                System.out.println("Yaklaştınız ama tutmadı");
            } else if (tahminsayi<(tutulansayi/2) || tahminsayi>(tutulansayi*1.5) ){
                System.out.println("Yaklaşamadınız! Başka sefere");
            }
        }
        else {
            System.out.println("Hatalı bi sayı girdiniz");
        }

    }
}
