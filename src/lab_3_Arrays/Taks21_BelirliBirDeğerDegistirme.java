package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Arrays;

public class Taks21_BelirliBirDeğerDegistirme {
    public static void main(String[] args) {
        System.out.println("\n-------Sor21--------");
        int[] numbers8 = {2, 6, 9, 0, 5, 8, 4, 5, 8};
        C04_Arrays_Methods.arrayYazdir(degerDegistirme(numbers8));
        System.out.println(Arrays.toString(numbers8));
    }
    /*
    Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
[5,7,8,5,9] → [5,7,8,5,9]
     */
    public static int[] degerDegistirme(int[] x) {
        for (int i = 0, j = 1; i < x.length - 1; i++) {

            if (x[i] == 5 && x[j] == 8) {
                x[j] = 1;
            }
            j++;
        }
        return x;
    }
}
