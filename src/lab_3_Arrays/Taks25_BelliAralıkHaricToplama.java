package lab_3_Arrays;

import java.util.Arrays;

public class Taks25_BelliAralıkHaricToplama {
    public static void main(String[] args) {
        System.out.println("\n-------Sor25--------");
        int[] num1 = {1, 5, 9, 3};
        int[] num2 = {2, 5, 28, 36, 9};
        int[] num3 = {5, 3, 9, 11, 9};
        int[] num4 = {5, 5, 5, 5, 9};
        int[] num5 = {5, 9, 5, 1, 9};
         System.out.println(belliAralikHaricToplama(num1));
         System.out.println(belliAralikHaricToplama(num2));
         System.out.println(belliAralikHaricToplama(num3));
         System.out.println(belliAralikHaricToplama(num4));
         System.out.println(belliAralikHaricToplama(num5));
    }
    /*
    Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki sayıları
toplama dahil etmeyin.
[1,5,9,3] → 4
[2,5,28,36,9] →2
[5,3,9,11,9] →20
[5,5,5,5,9] →0
[5,9,5,1,9] →0
     */
    public static int belliAralikHaricToplama(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == 5 && x[j] == 9) {
                    Arrays.fill(x, i, j + 1, 0);
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

}
