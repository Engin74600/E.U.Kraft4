package day_04_VeriableCod;

public class Widening_NarrowingCasting {
    public static void main(String[] args) {
        /*
        byte < short < int < long < float < double
        Bir veri türünün başka bir veri türüne atandığında gerçekleşen bir
dönüştürme(converting) işlemidir.
2 tip casting vardır.
-widening casting(automatically) küçük data type inden büyük olana
doğru olur.
*/
    int sayi = 9;
    double  kur= 18.9;

    kur = sayi;
        System.out.println("kur = " + kur);

            /* Narrowing casting(manually) büyük data type inden küçük olana doğru
olur.
         */
        double rate = 3.9; // büyük değer
        int num = 10; // küçük değer
        System.out.println("num = " + num);
        num = (int)rate;// büyüğü küçüğe eşitledik,
        //veri kaybı olacağından ayrıca () içinde manuel belirttik.
        //yoksa hata verir.
        System.out.println("num = " + num);
    }
}
