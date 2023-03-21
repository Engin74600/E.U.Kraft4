package day_13_ForLoops;

import java.util.Scanner;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        Faktoriyel : girilen sayıya kadar olan sayıların çarpımı
        3!= 3*2*1=6
        4!=4*3! veya 4!=4*3*2*1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı : ");
        int num= sc.nextInt();
        int faktoriyel =1;
        for (int i=1; i<=num; i++){
            faktoriyel*=i;
        }
        System.out.println(num+"! = "+faktoriyel);
    }
}
