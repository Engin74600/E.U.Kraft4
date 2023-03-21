package day_17_Methods;

public class C07_ParametreOFMethods {
    public static void main(String[] args) {

        int sayi = 5;

        kup(sayi);

        kare(sayi);

        isim("Engin");
        max(8,11);
        ortalama(56,34);




    }
    public static void kup(int x){
        int result = x*x*x;
        System.out.println("Sonuç : "+result);

    }
    public static void kare(int x){
        int result = x*x;
        System.out.println(x+" sayısının karesi : "+result);
    }
    // parametreyle isim yazdıran method yazın
    public static void isim(String name){
        System.out.println("İsminiz : "+name);
    }
    public static void max(int x,int y){
        int max=0;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
        System.out.println("büyük olan :"+max);
    }
    public static void ortalama(double x,double y){
        double ortalama =(x+y)/2;
        System.out.println("Ortalaması : "+ortalama);
    }
}
