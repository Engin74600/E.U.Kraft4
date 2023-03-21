package day_07_Aritmetic_Operators;

public class AricmaticOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = x + y;
        System.out.println("z = " + z);
        System.out.println("--------------\nExample 1\n");
        //Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?

        int birthyear = 1990;
        int thisyear = 2023;
        int yas = birthyear - thisyear;
        System.out.println("Ali yaş= " + yas);

        System.out.println("--------------\nExample 2\n");
        //Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
        //den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır

        int birthyear1 = 1990;
        int thisyear2 = 2023;
        int yas1 = birthyear - thisyear;
        int ahmetyas = yas1 - 5;
        System.out.println("ahmetyas = " + ahmetyas);

        System.out.println("--------------\nExample 3\n");
        //2 cm yarıçapına sahip dairenin alanı ve çevresini hesaplayın?
        //(PI=3.14)
        /*
        NOT :eğer kodunuzun içerisinde her yerde değişmeceğini
        düşünmeyeceğiniz bir değeri büyük harfle atayabilirisiniz.
        */
        /*
        Math sınıfından faydalanma!
         */
        System.out.println(Math.pow(2, 3));//kare alma
        System.out.println(Math.PI);//pi alma
        System.out.println(Math.max(5, 8));//büyük olanı al
        System.out.println(Math.sqrt(49));//kök alma

        double PI = 3.14;
        double r = 2;
        double alan = PI * r * r;
        System.out.println(alan);
        double alan2 = Math.PI * Math.pow(r, 2);
        System.out.println("alan = " + alan2);

        double cevre = 2 * r * PI;
        System.out.println("cevre = " + cevre);
        System.out.println("cevre = " + (2 * PI * r));
        System.out.println("--------------\nExample 4\n");
        //300 Fahrenheit kaç Celsius ‘dur? (℃=(℉-32)/1.8)
        double f = 300;
        double c = (f - 32) / 1.8;
        System.out.println("c = " + c);
        System.out.println("--------------\nExample 5\n");
        //: 32 Celsius kaç Fahrenheit ‘dır? (℃=(℉-32)/1.8)
        double c1 = 32;
        double f1 = c1 * 1.8 + 32;
        System.out.println("Fahrenheit = " + f1);
        System.out.println("--------------\nExample 6\n");
        /*Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik
        dersinden 89 almıştır.
        1.Ali’nin not ortalaması kaçtır?
        2. Ortalama sınıf geçme notu 80 üzeri olduğuna göre Ali’nin sınıfı
        geçti ise ekrana true geçmedi ise false yazdırın.
        (ipucu: boolean sonuc= ortalama>80)*/
        double fi = 92;
        double ki = 55;
        double ma = 89;
        double ort = (fi + ki + ma) / 3;
        System.out.println("ortalama = " + ort);
        System.out.println("--------------\nExample 6.2\n");
        boolean sonuc = ort > 80;
        System.out.println("Ali sınıfı geçti mi : " + sonuc);

        System.out.println("--------------\nExample 7\n");
        /*
        Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
vardır. Toplantıya 113 katılmıştır.
1.Toplantı salonun toplam kapasitesi nedir?
2.Kaç adet boş koltuk vardır ?
3.Kaç adet sırada oturulmaktadır ?
4. Kaç sıra tamamen boş kalmıştır.
5.Oturulan sıralarda kaç adet boş koltuk vardır?
         */
        int sira = 15;
        int koltuk = 12;
        int katilim = 113;

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

        System.out.println("--------------\nExample 8\n");
        /*
        : 31502 saniye kaç saat kaç dakika kaç saniyedir?
(1 saat 60 dakika 1 dakika 60 sn)
         */
        int topsn = 31502;
        int saat = 3600;
        int dk= 60;
        int tsaat =topsn/saat;
        int tdk = (topsn%saat)/dk;
        int tsn = topsn-(tsaat*3600+tdk*60);
        System.out.println(topsn+" sn, "+tsaat+" saat, "+tdk+" dk, "+tsn+" sn'dir");
// veya


    }
}
