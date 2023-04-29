package day_34_Arrays_4;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Arrays;

public class C04_Taks {
    public static void main(String[] args) {
        C04_Arrays_Methods.arrayYazdir(buildIntArray(8));

        System.out.println("\n---------------");
        System.out.println(averageOfMaxMin(buildIntArray(8)));

        System.out.println("\n---------------");
        int[] x={3,55,42,98,87,9};
        C04_Arrays_Methods.arrayYazdir(fillArrayWithSmalllest(x));

        System.out.println("\n---------------");
        int[] x1={3,55,42,98,87,9};
        C04_Arrays_Methods.arrayYazdir(fillArrayWithSmalllestExcepBiggest(x1));
    }
    /*Taks 5) Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]*/
    public static int[] buildIntArray(int n){
        int[] intArr= new int[n];
        for (int i = 0; i <intArr.length ; i++) {
            intArr[i]=i;
        }
        return intArr;
    }
    //Taks 6)Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static double averageOfMaxMin(int[] arr){
        double avg=0;
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        avg=(double)(min+max)/2;
        return avg;
    }
    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini onunla dolduran bir
    //method yazın.
    public static int [] fillArrayWithSmalllest(int[] arr){

        Arrays.sort(arr);
        int min=arr[0];
        Arrays.fill(arr,min);
        return arr;
    }
    /*
    Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
onunla dolduran bir method yazın.
     */
    public static int [] fillArrayWithSmalllestExcepBiggest(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
                arr[i]=min;
            }

        }
        return arr;
    }
}
