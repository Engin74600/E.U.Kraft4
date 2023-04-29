package lab_3_Arrays;

import java.util.Arrays;

public class Taks06_İkiSayiArasiArrayOlustur {
    public static void main(String[] args) {

        System.out.println("\n-------Soru6--------");
        System.out.println(Arrays.toString(arrayOlusturma(8, 15)));
        System.out.println(Arrays.toString(arrayOlusturma2(8, 15)));
    }
    /*
   Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
createArray(8,15) → [8,9,10,11,12,13,14,15]
    */
    public static int[] arrayOlusturma(int x, int y) {
        int fark = x - y;
        int[] result = new int[Math.abs(fark) + 1];
        int index=0;
        if (x > y) {
            for (int j = y; j <= x; j++) {

                result[index] = j;
                index++;
            }
        } else {
            for (int j = x; j <= y; j++) {

                result[index] = j;
                index++;
            }
        }
        return result;
    }
    public static int [] arrayOlusturma2(int x,int y){
        int min =Math.min(x,y);
        int max =Math.max(x,y);
        int[] yeniarray=new int[max-min+1];
        for (int i = min,j=0; i <=max ; i++,j++) {
            yeniarray[j]=i;
        }
        return yeniarray;
    }
}
