package day_19_CustomMethodsReturn;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println(faktoriyelHesaplama(7));


    }
    // verdigimiz bir sayinin faktoryelini hesaplayip
    //sonucu bize donduren bir method olusturun
    /*method oluşturma aşamaları
    1 puplic static (standart)
    2 sonuç dönüştürecekse data tipi
    3 method adı
    4 method parantezi() parametre olacak mı,olacaksa parametre tip ve isi
    5 {} bady açıp döndürülecek işlemi yaz
    6 Return keyword'u ile planlanan değeri döndür.
     */
    public static int faktoriyelHesaplama(int sayi){
        int faktoriyel=1;
        for (int i = 1; i <=sayi ; i++) {
            faktoriyel*=i;
        }
        return faktoriyel;
    }
}
