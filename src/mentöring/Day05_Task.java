package mentöring;

import java.util.Scanner;

public class Day05_Task {
    public static void main(String[] args) {

        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen 2 sayı girin");
        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean tek = (x-y)%2==1;
        System.out.println("Sayılatın farkı tek mi? : " + tek);
        //veya
        tek = (x-y)%2!=0;
        System.out.println("Sayılatın farkı tek mi? : " + tek);
        //veya
        tek = !((x-y)%2==0);
        System.out.println("Sayılatın farkı tek mi? : " + tek);

    }
}
