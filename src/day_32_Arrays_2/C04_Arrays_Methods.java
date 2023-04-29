package day_32_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {

        //System.out.println("kelimeDepola()[2] = " + kelimeDepola()[2]);

        System.out.println("\n----Soru 1-----");
        int [] x ={15,1,4,23,45,53};
        int [] x1 ={3,4,5,6,7};
        System.out.println("buyukMu(x) = " + buyukMu(x));
        System.out.println("buyukMu(x1) = " + buyukMu(x1));
        /* if(buyukMu(x)){
            System.out.println("uzunluk 5 den büyük");
        }else {
            System.out.println("uzunluk 5 den küçük");
        }*/

        System.out.println("\n----Soru 2-----");
        int sayi =5;
        System.out.println("varMi(x) = " + varMi(x,sayi));
        System.out.println("varMi(x1) = " + varMi(x1,sayi));
        System.out.println("----ForEach---");
        System.out.println("varMi(x) = " + varMi(x));
        System.out.println("varMi(x1) = " + varMi(x1));

        System.out.println("\n----Soru 3-----");
        int[] x2={15,2,4,88,456};
        System.out.println("esitMi(x,x1) = " + esitMi(x, x1));
        System.out.println("esitMi(x,x2) = " + esitMi(x, x2));

        System.out.println("\n----Soru 4-----");
        double[] m={2.00,3.01,4.56};
        double[] n={1.13,7.01,5.56};
        System.out.println("Arrays.toString(yeniArray(m,n)) = " + Arrays.toString(yeniArray(m, n)));
        //yeni bir array yazdırmak için Arrays.toString methodunu kullanıyoruz
        //farklı yol
        System.out.println("Arrays.toString(yeniArray(x,x1)) = " + Arrays.toString(yeniArray(x, x1)));

        System.out.println("---String---");
        String[] str={"Ali","Veli","Deli"};
        String[] str1={"Hoş","Koş","Boş","Koç"};
        System.out.println("Arrays.toString(yeniArray(str,str1)) = " + Arrays.toString(yeniArray(str, str1)));

        System.out.println("\n----Soru 5-----");
        System.out.println("arrayToplam(x) = " + arrayToplam(x));
        System.out.println("arrayToplam(x1) = " + arrayToplam(x1));
        System.out.println("arrayToplam2(x) = " + arrayToplam2(x));
        System.out.println("arrayToplam2(x1) = " + arrayToplam2(x1));

        System.out.println("\n----Soru 6-----");
        System.out.println("Arrays.toString(toplamaCarpmaYeniArray(x1)) = " + Arrays.toString(toplamaVeCarpim(x1)));
        System.out.println("Arrays.toString(toplamaCarpma(x1)) = " + Arrays.toString(toplamaCarpma(x1)));

        System.out.println("\n----Soru 7-----");
        arrayYazdir(arrayBirlestir(x,x1));
        arrayYazdir(arrayBirlestir1(x,x1));

    }

    public static String[] kelimeDepola(){
        String[] array= new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("1.kelime");
        String kelime1= sc.nextLine();
        array[0]=kelime1;
        System.out.println("2.kelime");
        String kelime2= sc.nextLine();
        array[1]=kelime2;
        System.out.println("3.kelime");
        String kelime3= sc.nextLine();
        array[2]=kelime3;
        return array;

    }
    // soru 1) Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean buyukMu(int[] arr){return arr.length>5;}

    //Soru 2)Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin
    public static boolean varMi(int[] arr,int sayi) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                return true;
            }
        }
        return false;
    }
    public static boolean varMi(int[] arr) {
        for (int x:arr) {
            if (x==5){
                return true;
            }
        }
        return false;
    }
    // soru3) Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün
    public static boolean esitMi(int[]x,int[]y) {return x[0] == y[0];}

    // Soru 4) 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün
    public static double [] yeniArray(double[]x,double[]y){
        double[] t=new double[2];
        t[0]=x[0];
        t[1]=y[0];
        return t;
    }
    public static double [] yeniArray(int[]x,int[]y){
        double[] t={x[0],y[0]};
        return t;
    }
    public static String [] yeniArray(String[]a,String[]b) {
        String[] t = new String[2];
        t[0] = a[0];
        t[1] = b[0];
        return t;
    }
    // Soru 5) Int array in elemanlarının toplamını veren bir method yazın
    public static int arrayToplam(int[] x){
        int sum=0;
        for (int i = 0; i < x.length ; i++) {
            sum+=x[i];
        }
        return sum;
    }
    public static int arrayToplam2(int[] x){
        int sum=0;
        for (int a:x) {
            sum+=a;
        }
        return sum;
    }
    //Soru 6)İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    public static int[] toplamaVeCarpim(int[] x){
        int top=0;
        for (int a:x) {
            top+=a;
        }
        int crp=1;
        for (int a:x) {
            crp*=a;
        }
        int[] arr={top,crp};
        return arr;
    }
    public static int[] toplamaCarpma(int[] x){
        int top=0;
        int crp=1;
        for (int i = 0; i <x.length; i++) {
            top+=x[i];
            crp*=x[i];
        }
        int[] arr={top,crp};
        return arr;
    }
    //Aray yazdırma methodu
    public static void arrayYazdir(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }

        }
    }
    public static void arrayYazdir(double[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(String[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(char[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(boolean[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    //Soru 7) Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    public static int[] arrayBirlestir(int [] arr1, int[] arr2){
        int[] yeniArray = new int[arr1.length+arr2.length];
            for (int i = 0; i < arr1.length; i++) {
                yeniArray[i]=arr1[i];
            }
            int j=0;
            for (int i = arr1.length; i < yeniArray.length; i++) {
                yeniArray[i]=arr2[j];
                j++;
            }
            //2.foru birinci arrayin bittiği ywerden başlattık.
        // yeni arrayin uzunluğu kadar dönsün dedğimizde 2. array kadar dönmüş olacak
        //dolayısıyla 2.array eleman tayini harici bir değişkene bağladık
            return yeniArray;
    }
    //2. çözüm
    public static int[] arrayBirlestir1(int [] arr1, int[] arr2) {
        int[] yeniArray = new int[arr1.length + arr2.length];
        for (int i = 0,j=0; i < yeniArray.length; i++) {
            if (i<arr1.length){
                yeniArray[i]=arr1[i];
            } else {
                yeniArray[i]=arr2[j];
                        j++;
            }
        }
        return yeniArray;
    }

}
