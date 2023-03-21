package day_12_CFS_Switch;

import java.util.Scanner;

public class HWork_Ortalama {
    public static void main(String[] args) {
        /*
        TASK
Not aralığı Harf karşılığı
85-100 A
70-85 B
55-70 C
40-55 D
0-40 F
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ders notu girin :");
        double not = sc.nextDouble();
        if (not<40){
            System.out.println("F aldınız!");
        } else if (not<55){
            System.out.println("D aldınız!");
        }else if (not<70){
            System.out.println("C aldınız!");
        }else if (not<85){
            System.out.println("B aldınız!");
        }else if (not<=100){
            System.out.println("A aldınız!");
        }else {
            System.out.println("Yanlış bir not girdiniz");
        }
    }
}
