package mentöring;

import java.util.Scanner;

public class Day05_TaskCiftMi {
    public static void main(String[] args) {
        //        Task 2
//        Kullanıcıdan bir sayı alın
//        sayı cift sayı mı olduğunu
//        bir boolean değişkeni ile kontrol edin
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int x = sc.nextInt();
        boolean cft= x%2==0;
        System.out.println("Bu sayı çift mi? :"+(cft));
        // veya
        cft = !(x%2==1);
        System.out.println("Bu sayı çift mi? :"+(cft));
        //veya
        cft = x%2!=1;
        System.out.println("Bu sayı çift mi? :"+(cft));

        boolean tekmi=(x%2==1);
        System.out.println("Bu sayı tek mi? :"+(tekmi));
        //veya
        tekmi=!(x%2==0);
        System.out.println("Bu sayı tek mi? :"+(tekmi));
        //veya
        tekmi= x%2!=0;
        System.out.println("Bu sayı tek mi? :"+(tekmi));
    }
}
