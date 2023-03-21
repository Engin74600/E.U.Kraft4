package day_07_Aritmetic_Operators;

public class Aritmeticoperators2 {
    public static void main(String[] args) {

       // 4500 dk kaç saattir
        int dk1= 4500;
        int saat1 = dk1/60;
        System.out.println("saat1 = " + saat1);

        // 4321 dk saat dk ve sn yazılınca sn kac olur.
        int sn1 =4321 % 60;


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
        int tsn = topsn%dk;
        System.out.println(topsn+" sn, "+tsaat+" saat, "+tdk+" dk, "+tsn+" sn'dir");








    }
}
