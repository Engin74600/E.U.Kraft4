package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

public class Taks20_EnKucukDegeriIlkEndekseAtama {
    public static void main(String[] args) {
        System.out.println("\n-------Sor20--------");
        int[] numbers1 = {23, 54, 8, 96, 9, 41};
        C04_Arrays_Methods.arrayYazdir(enKucukDegeriIlkIndexseAtama(numbers1));
    }
    /*
    Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
indekslere 0 atayan metodu yazınız.
[5,7,1,9] [1,0,0,0]
     */
    public static int[] enKucukDegeriIlkIndexseAtama(int[] x) {
        int[] yeniArr = new int[x.length];
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        yeniArr[0] = min;
        return yeniArr;
    }
}
