package day_05_Week01_Review;

public class Example {
    public static void main(String[] args) {
    //eşit kenar üçgenin 1 kanrı 5 cm ise
        //çevresi kaç cm
        // ekrana üçgenin çevresi ... yazdırn.
        System.out.println("---------\nExample 1\n");

        int kenar = 5;
        int cevre = 3 * kenar;
        System.out.println("Üçgenin cevresi " + cevre + " cm'dir.");
        // ahmet 1999 doğumludur. Şu an kaç yaşındadır.
        System.out.println("---------\nExample 2\n");
        int ahmetbirth = 1999;
        int thisYear = 2023;
        int ahmetage = thisYear - ahmetbirth;
        System.out.println("ahmetdogum = " + ahmetage);
        // ahmet 12, annesi ayse hanım 35 yaşında olduğuna göre
        // yaşları toplamı kaç. totalCount
        System.out.println("---------\nExample 3\n");
        int ahmetAge = 12;
        int ayseAge = 35;
        int totalCount = ayseAge + ahmetAge;
        System.out.println("Total Count = " + totalCount);
/*
emel 8, fatih emelden 7 yaş büyük, salih de fatihten 5 yaş küçüktür.
salih yaş kaç
 */
        System.out.println("---------\nExample 3\n");

        int emel = 8;
        int fatih = emel +7;
        int salih = fatih -5;
        System.out.println("salih'in yaşı = " + salih);

        /*
        öğrencinin adı harun, öğretmenin adı ise leyla.
        bu isimleri bi değşlkene tanımlayarak
        Leyla öğretmen  Harun'u ayağa kaldırarak
        aferin dedi
         */
        System.out.println("---------\nExample 4\n");
        String l = "Leyla";
        String h = "Harun";
        System.out.println(l+" öğretmen "+h+"'a 'Aferşn' dedi");
        /* 60 soruluk sınavda 4 yanlıi 1 doğruyu götürüyor
        tüm sorulara cvp veren öğrencinin 51.25 neti varsa
        kaç soruya yanlış cvp vermiştir.
         */
        System.out.println("---------\nExample 5\n");
        int topcvp= 60;
        double net = 51.25;
        double y = (topcvp-net)/1.25;
        System.out.println("Yanlış = " + y);


    }
}
