package day_28_Quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //soru 1
        System.out.println("----soru 1------");
        System.out.println("Bir sayı girin");
        int sayi=sc.nextInt();
        System.out.println(sayiToplama(sayi));
        //soru 2
        System.out.println("----soru 2------");
        System.out.println("Kilo ve boyunuzu sırayla girin");
        double kilo=sc.nextDouble();
        double boy=sc.nextDouble();
        System.out.println(vucutKitleEndeksi(kilo, boy));
        //soru 3
        System.out.println("----soru 3------");
        String kelime ="mehmet";
        char harf = 'e';
        System.out.println(kacAdet(kelime, harf));
        //soru 4
        System.out.println("----soru 4------");
        System.out.println(faktoriyel(5));
        //soru 5
        System.out.println("----soru 5------");
        int num1=4,num2=5,num3=6;
        System.out.println(concatInt(num1, num2));
        System.out.println(concatInt(num1, num2, num3));

        String str1="Ali",str2="Veli",str3="Deli";
        System.out.println(concatString(str1, str2));
        System.out.println(concatString(str1, str2,str3));
        //soru 6
        System.out.println("----soru 6------");
        String word1="kavak";
        String word2="Kavak";
        String word3="cıvık";
        System.out.println(polindrom(word1));
        System.out.println(polindrom(word2));
        System.out.println(polindrom(word3));

        //soru 7
        System.out.println("----soru 7------");
        String kelime1 ="Mehmet";
        String kelime2 ="Mehmet";
        String kelime3 ="mehmet";
        String kelime4 ="Mahmut";
        System.out.println(kelimeKontrol(kelime1, kelime2));
        System.out.println(kelimeKontrol(kelime1, kelime3));
        System.out.println(kelimeKontrol(kelime1, kelime4));


    }
    //soru 1
    public static int sayiToplama(int sayi){
        int result=0;
        for (int i = 1; i <=sayi ; i++) {
            result+=i;
        }
        return result;

    }
    //soru 2
    public static String vucutKitleEndeksi(double kilo,double boy){
        double endeks =(kilo/(boy*boy));
        String result="";
        if (endeks>35) {
            result= "Vücut kitle endeksi : " + endeks + "\n\t Sonuç : Obez";
        }else if (endeks>30) {
            result= "Vücut kitle endeksi : " + endeks + "\n\t Sonuç : kilolı";
        }else if (endeks>25) {
        result="Vücut kitle endeksi : " + endeks + "\n\t Sonuç : Normal";
        }else if (endeks>20){
            result= "Vücut kitle endeksi : "+endeks+"\n\t Sonuç : Zayıf";
        }else if(endeks<=0){
            result= "hatalı bir işlem yaptınız";
        }
        return result;
    }
    //Soru 3
    public static String kacAdet(String str, char c){
        str=str.toLowerCase();
        int adet=0;
        for (int i = 0; i <str.length() ; i++) {
            if(c==str.charAt(i)){
                adet++;
            }
        }return str+" kelimesinde "+adet+" adet "+c+" vardır.";
    }
    //soru4
    public static int faktoriyel(int x){
        int result=1;
        for (int i = 1; i <=x ; i++) {
            result*=i;
        }
        return result;
    }
    //Soru 5
    public static int concatInt(int num1,int num2){
        return num1+num2;
    }
    public static int concatInt(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static String concatString(String str1,String str2){
        return str1+str2;
    }
    public static String concatString(String str1,String str2,String str3){
        return str1+str2+str3;
    }
    //soru 6
    public static boolean polindrom(String str){
        str=str.toLowerCase();
        String p1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            p1+=str.charAt(i);
        }
        return str.equals(p1);
    }
    //soru 7
    public static boolean kelimeKontrol(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.equals(str2)){return true;}
        else {return false;}
    }
}
