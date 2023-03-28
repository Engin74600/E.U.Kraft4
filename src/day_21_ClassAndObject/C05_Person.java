package day_21_ClassAndObject;

public class C05_Person {
    //isim, cıns, yaş fields
    //uyu(), oyun oyna(); methods
    String isim;
    String cinsiyet;
    int yas;


    public void uyu(){
        System.out.println("uyuyor");
    }
    public void oyunOyna(){
        System.out.println(isim+"uyuyor");
    }
    public void tumbilgilerigetir(){
        System.out.println("isim"+isim);
        System.out.println("yas"+yas);
        System.out.println("cinsiyet"+cinsiyet);
    }


}
