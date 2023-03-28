package day_21_ClassAndObject;

public class Daire {
    int r;//her dairede farklı olduğu için bir değer atamadık
    double PI=Math.PI;//Tüm dairelerde ortak özellikse PI'ye değer atadık
    public void alanhesabı (){
        System.out.println(PI*r*r);
    }
    public double alanHesapla(){
        return 2*PI*r;
    }


}
