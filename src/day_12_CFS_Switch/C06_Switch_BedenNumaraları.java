package day_12_CFS_Switch;

import java.util.Scanner;

public class C06_Switch_BedenNumaraları {
    public static void main(String[] args) {
        /*Bir program yazın switch yapısını kullanın. Şu beden
        numaralarını : small(38-40-42), medium(44-46-48),
                large(50-52-54) yakalasın. Aşağıdaki şekilde çıktı alın.
        Example output: 50 numara bir large bedendir*/
        Scanner sc = new Scanner(System.in);
        int beden = sc.nextInt();
        switch (beden){
            case 38,40,42://java 14ten sonra case'lerde çoklu seçene oldu
                System.out.println("small");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
                System.out.println("Bedeniniz elimizde yok");


        }





    }
}
