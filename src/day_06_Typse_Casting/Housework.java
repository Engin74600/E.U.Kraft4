package day_06_Typse_Casting;

public class Housework {
    public static void main(String[] args) {
        System.out.println("-----------\n\tHAVUZ PROBLEMİ\n");
        //Bir musluğu A musluğu tek başına 12 saatte,
        // B musluğu 30 saatte dolduruyor,
        // c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        // Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.
        int h = 0;
        int a = 12;
        int b = 30;
        int c = 9;

        for (h = 0; h < 200; h++) {
            if (h % a == 0 && h % b == 0 && h % c == 0) {
            }
        }


        double havuzbirim = h;//veya direk 180 Ortak Katları
        double a1saat = havuzbirim / a;
        double b1saat = havuzbirim / b;
        double c1saat = havuzbirim / c;
        double havuzTopSaat = havuzbirim / (a1saat + b1saat - c1saat);
        System.out.println("Havuz, üç musluk açıkken\ntoplam " + havuzTopSaat + " saatte dolar");
        // veya
        double a1s = 1/(double)a;
        double b1s = 1/(double)b;
        double c1s = 1/(double)c;
        double tsaat = 1/(a1s+b1s-c1s);
        System.out.println("Toplam saat = " + tsaat);


    }
}
