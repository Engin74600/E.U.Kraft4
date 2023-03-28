package day_21_ClassAndObject;

import java.util.Scanner;

public class C04_SayıToplama {
    public static void main(String[] args) {
        sayiAl();
    }


    public static void sayiAl(){
        Scanner sc=new Scanner(System.in);
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi2son=ucunkati(sayi2);
        System.out.println(sayilariTopla(sayi1,sayi2son));

    }
    public static int ucunkati(int sayi2){
        if (sayi2%3==0){
            return sayi2;
        }
        sayi2=sayi2-(sayi2%3);
        return sayi2;//veya return sayi2-(sayi2%3);
    }
    public static int sayilariTopla(int a,int b){
        int sonuc = a+b;
        return sonuc;
    }
}
