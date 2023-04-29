package lab_3_Arrays;

import java.util.Arrays;

public class Taks05_EnKucukSayiyiAtama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 3};

        System.out.println("\n-------Soru5--------");
        System.out.println(Arrays.toString(enKucuguHepsineAta(numbers)));

    }
    /*
    Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
Arrays.fill kullanılmayacak)
[1,2,-8,-9] [-9,-9,-9,-9]
     */
    public static int[] enKucuguHepsineAta(int[] x) {
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = min;
        }
        return x;
    }
}
