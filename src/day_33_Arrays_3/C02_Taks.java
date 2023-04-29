package day_33_Arrays_3;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Scanner;

public class C02_Taks {
    public static void main(String[] args) {
        System.out.println("---Soru 8----");
        int arr[]={9,4,1,11,44,66};
        System.out.println(maxOfArray(arr));
        System.out.println(minOfArray(arr));

        System.out.println("\n---Soru 9----");
        C04_Arrays_Methods.arrayYazdir(swapFirstAndlass(arr));

        System.out.println("\n---Soru 10----");
        int arr1[]={9,4,1,11,44,66};
        C04_Arrays_Methods.arrayYazdir(terstenYazdir(arr1));
        C04_Arrays_Methods.arrayYazdir(terstenYazdir2(arr1));

        System.out.println("\n---Soru 10----");
        System.out.println(tekIndeksleriTopla(arr1));

        System.out.println("\n---Soru 11----");
        C04_Arrays_Methods.arrayYazdir(createStringArray());


    }
    //soru 8)İnt arry in en büyük elemanının döndüren bir method yazın
    public static int maxOfArray(int arr[]){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max < arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    public static int minOfArray(int arr[]){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min > arr[i]) {
                min=arr[i];
            }
        }
        return min;
    }
    //soru9)Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın
    public static int [] swapFirstAndlass(int [] arr){
        int temp =arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }
    //Soru 10) Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] terstenYazdir(int[] arr){
        int[] tersArr=new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
                tersArr[j] = arr[i];
        }
        return tersArr;
    }
    //veya
    public static int[] terstenYazdir2(int[] arr){
        int[] tersArr=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            tersArr[arr.length-1-i] = arr[i];
        }
        return tersArr;
    }
    //Soru 11)Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın
    public static int tekIndeksleriTopla(int[] arr){
        int result=0;
        for (int t = 1; t <arr.length; t+=2) {
                result+=arr[t];
        }
        return result;
    }
    //Soru 12) Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
    //bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.
    public static String[] createStringArray(){
        Scanner sc =new Scanner(System.in);
        System.out.println("String Array'in uzubnluuğunu girin");
        int lenght=sc.nextInt();
        sc.nextLine();
        String strArr[]=new String[lenght];
        for (int i = 0; i <lenght ; i++) {
            System.out.println("String Array'in "+(i+1)+". elemanını giriniz.");
            strArr[i]=sc.nextLine();
        }
        return strArr;
    }
}
