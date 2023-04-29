package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

public class Taks09_ArrayTersCevirme {
    public static void main(String[] args) {
        System.out.println("\n-------Soru9--------");
        int[] numbers1 = {23, 54, 8, 96, 9, 41};
        C04_Arrays_Methods.arrayYazdir(tersCevir(numbers1));
    }
    /*Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
[5,4,3,2,1] -----------> [1,2,3,4,5]*/
    public static int[] tersCevir(int[] x) {
        int[] tersArray = new int[x.length];
        for (int i = 0, j = x.length - 1; i < x.length; i++) {
            tersArray[j] = x[i];
            j--;
        }
        return tersArray;
    }
}
