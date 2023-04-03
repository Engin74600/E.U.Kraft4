package day_25_Summary;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Bir
method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
ise kullanıcıyı aynı sürece sokun ..(
         */
        Scanner sc=new Scanner(System.in);
        boolean flag =true;
        while (flag){
            System.out.println("1. Kelime : ");
            String a= sc.nextLine();
            System.out.println("2. Kelime : ");
            String b= sc.nextLine();
            flag=taks5(a,b);

        }


        //sour5();


    }
    public static boolean taks5(String a,String b){
        if (a.equalsIgnoreCase(b)){

            System.out.println("Bukelimeler  aynı");
            return true;
        }
        if(a.length()==b.length()) {
            System.out.println("Girdiğiniz kelimelerin karakter sayısı eşittir");
            return true;
        }
            System.out.println("Girdiğiniz kelimeler farklı uzunlukta\ntekrar girin");
        return false;
    }


    public static String sour5(){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        if (a.equalsIgnoreCase(b)){
            return "Bukelimeler  aynı";
            //bu ise zaten koddan return ile çıkacak
        }
        if(a.length()==b.length()){
            return "Girdiğiniz kelimelerin karakter sayısı eşittir";
        } else {
            System.out.println("Girdiğiniz kelimeler farklı uzunlukta\ntekrar girin");
            return sour5();
        }
    }
}
