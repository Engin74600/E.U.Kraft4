package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

public class Taks26_SonaAtama {
    public static void main(String[] args) {
        System.out.println("\n-------Sor26--------");
        int[] num6 = {5, 1, 9, 6, 1, 4, 7, 11, 25, 36};
        C04_Arrays_Methods.arrayYazdir(sonaAtama(num6, 1));
    }
    /*
    Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
[5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]
     */
    public static int[] sonaAtama(int[] x, int y) {
        int[] yenix = new int[x.length];
        int sayi = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y) {
                yenix[sayi] = x[i];
                sayi++;
            }
        }
        for (int i = sayi; i < yenix.length; i++) {
            yenix[i] = y;
        }
        return yenix;
    }
}
