package example_Lab_1;

import java.util.Scanner;

public class Taks5_Ebob {
    public static void main(String[] args) {
        //Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırın. 1 ile 7
        //sonuc 1, 6-12(6)
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz!");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        ebob(sayi1,sayi2);*/
        System.out.println(ebob2());
    }
    /**
     * a method that finds the EBOB of 2 numbers received from the user
     * @param a
     * @param b
     */
    public static void ebob(int a,int b){
        int kucuk=0;
        if (a<b) {
            kucuk=a;
        }else {
            kucuk=b;
        }
        int enbuyuk=0;
        for (int i = 1; i <=kucuk ; i++) {
            if (a%i==0 && b%i==0){
                if (i>enbuyuk){
                    enbuyuk=i;
                }
            }
        }System.out.println("Girilen sayıların Ebob'u : "+enbuyuk);
    }
    public static int ebob2(){
        Scanner sc =new Scanner(System.in);
        System.out.println("İlk sayıyı girin :");
        int ilksayi = sc.nextInt();
        System.out.println("ikinci sayiyi girin : ");
        int ikincisayi = sc.nextInt();
        int ebob =0;
        for (int i = 0; i<=ikincisayi||i<=ilksayi ; i++) {
            if (i%ilksayi==0 && i%ikincisayi==0){
                ebob=i;
            }

        }return ebob;
    }
}
