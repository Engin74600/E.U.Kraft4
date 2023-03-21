package day_06_Typse_Casting;

public class Task {
    public static void main(String[] args) {

        System.out.println("----------\n\tExample 1\n");
      //  Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?
        int aliBirth=1990;
        int thisyear=2023;
        int aliAge= thisyear-aliBirth;
        System.out.println("Ali Age = " + aliAge);

        System.out.println("----------\n\tÖdev\n");
        //60 soruda tamamını cvlayan bi öğrenci 51,25 net yaptıysa
        //ve 4 yanlış 1 doğruyu götürse
        //yanlış sayısı kaç?
        double tsoru = 60;
        double oran = 4;
        double net = 51.25;
        double yanlis = (tsoru-net)/(1+1/oran);
        // oran: 4 yanlış 1 doğruysa 1.25 soru demek
        System.out.println("yanlış sayısı = " + yanlis);

        System.out.println("----------\n\tÖdev 2. versiyon\n");
        // toplam  soru 60, yanlış soru 20, 4 yanlış 1 doğru;
        double tcvp=60;
        double tyanlis=15;
        double oran1 = 4;
        double net1 = tcvp-tyanlis-(tyanlis/4);
        System.out.println("net = " + net1);
        System.out.println("----------\n\tExample 2\n");
        //ali sınıfta 7-7 hali saha yapmak istiyor
        //kendisi hakem olacak
        //sınıf 18 kişi ise
        //kaç kişi oyumn dışı
        int takim = 7;
        int hakem = 1;
        int mevcut = 18;
        int kalan= mevcut-(takim*2+hakem);
        System.out.println("kalan = " + kalan);
        //veya
        int kalan2= mevcut%7-hakem;
        System.out.println("kalan2 = " + kalan2);

        System.out.println("----------\n\tExample 3\n");
        //ali okul 7-7 hali saha yapmak istiyor
        //kendisi hakem olacak
        //okul 188 kişi ise
        //kaç kişi dışarıda kalır
        int takimler = 14;
        int hakem1 = 1;
        int omevcut = 188;
        int kalan1= omevcut%(takimler+hakem1);
        System.out.println("kalan1 = " + kalan1);


    }
}
