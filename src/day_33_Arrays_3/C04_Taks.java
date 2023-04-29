package day_33_Arrays_3;

import day_32_Arrays_2.C04_Arrays_Methods;

public class C04_Taks {
    public static void main(String[] args) {
        String str="merhaba java insanları bugün nasılsınız";
        C04_Arrays_Methods.arrayYazdir(stringToAray(str));

        String str2="kayısı, armut, üzüm, çilek, nar";
        C04_Arrays_Methods.arrayYazdir(stringToAray2(str2));


    }

    //Soru 1)«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[] stringToAray(String str){
        return str.split(" ");
    }
    //soru 2) «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine armut atayın.
    public static String[] stringToAray2(String str){
        String[] newStr=str.split(" ");
        for (int i = 0; i <newStr.length ; i++) {
            if (newStr[i].length()<5) {
                newStr[i]="armut";
            }

        }
        return newStr;
    }
}
