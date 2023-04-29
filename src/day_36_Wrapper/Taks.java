package day_36_Wrapper;

import java.util.Arrays;

public class Taks {
    public static void main(String[] args) {
        String str = "|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+l%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        System.out.println(Arrays.toString(stringtekiSayilariBulVeArrayDegistir(str)));
    }

    // task2 -- string içindeki sayıları bir aray içinde döndüren bir method yazın
    public static int[] stringtekiSayilariBulVeArrayDegistir(String str) {
        String sayilar = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sayilar += str.charAt(i);
            }
        }
        String [] arr=sayilar.split("");
        int[] sayiArr= new int[arr.length];
        for (int j = 0,k=0; j < sayiArr.length; j++) {
            sayiArr[j]=Integer.parseInt(arr[j]);
        }
        return sayiArr;
    }
}
