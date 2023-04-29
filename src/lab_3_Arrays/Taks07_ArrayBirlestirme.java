package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Arrays;

public class Taks07_ArrayBirlestirme {
    public static void main(String[] args) {
        System.out.println("\n-------Soru7--------");
        int[] numbers1 = {23, 54, 8, 96, 9, 41};
        int[] numbers2 = {22, 55, 7, 99, 6, 45};
        System.out.println(Arrays.toString(arrayBirlestirme(numbers1, numbers2)));
        C04_Arrays_Methods.arrayYazdir(arrayBirlestirme(numbers1,numbers2));

    }
    /*
    Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
oluşturan metodu yazınız.
[1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]
     */
    public static int[] arrayBirlestirme(int[] x, int[] y) {
        int[] yeniArray = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            yeniArray[i] = x[i];
        }
        int j = 0;
        for (int i = x.length; i < yeniArray.length; i++) {
            yeniArray[i] = y[j];
            j++;
        }
        return yeniArray;
    }
}
