package day_07_Aritmetic_Operators;

import java.util.Scanner;

public class Task3_ToplantiSalanu {
    public static void main(String[] args) {
        System.out.println("-------ÖDEV 3-----\n");
   /*Ödev 3: Toplantı salonunda sıra ve her sırada kaç adet koltuk olduğunu ve Toplantıya
kaç kişinin katıldığını kullanıcıya girdirin.
1.Toplantı salonun toplam kapasitesi nedir?
2.Kaç adet boş koltuk vardır ?
3.Kaç adet sırada oturulmaktadır ?
4. Kaç sıra tamamen boş kalmıştır.
5.Oturulan sıralarda kaç adet boş koltuk vardır?
Gibi değerleri ekrana yazdıran program yazın.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Toplanrı salonun sıra sayısı?");
        int sira = sc.nextInt();
        System.out.println("Her sıradaki koltuk sayısı?");
        int koltuk = sc.nextInt();
        System.out.println("Katılımcı sayısı?");
        int katilim = sc.nextInt();

        int kapasite = sira * koltuk;
        System.out.println("Soru 1\n\tKapasite = " + kapasite);
        int boskoltuk = kapasite - katilim;
        System.out.println("Soru 2\n\tBoş koltuk = " + boskoltuk);
        int oturulansira = katilim / koltuk + 1;
        System.out.println("Soru 3\n\tOturulan sıra sayısı = " + oturulansira);
        int bossira = sira - oturulansira;
        System.out.println("Soru 4\n\tBoş sıra sayısı = " + bossira);
        int siradaBosKoltuk = koltuk - (katilim % koltuk);
        System.out.println("Soru 5\n\tOturulan Sırada Boş Koltuk Sayısı= " + siradaBosKoltuk);


    }
}
