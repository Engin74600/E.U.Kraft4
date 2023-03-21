package day_15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
//byte; short;char; int; String kullanılabilir

        int x = 5;
        switch (x){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }

        // et menü, sebze menü, çocuk menü
        // et m :pirzola 50 -tavuk 30
        //sebze m : roka salata 40; enginar 30
        // cocuk menü : p.kızartması 10; makarna 5 tl

        Scanner sc = new Scanner(System.in);
        System.out.println("Et Menü (1)\n  Sebze Menü (2)\n    Çocuk Menü(3)");
        int tercih_1= sc.nextInt();
        switch (tercih_1) {
            case 1:
                System.out.println("Pirzola mı(1)\n  Tavuk mu(2)");
                int etmenu = sc.nextInt();
                switch (etmenu) {
                    case 1:
                        System.out.println("Pirzola 50TL ");
                        break;
                    case 2:
                        System.out.println("Tavuk 30TL");
                        break;
                    default:
                        System.out.println("Hatalı bir giriş");
                }
                break;
            case 2:
                System.out.println("Roka Salatası mı(1)\n  Enginar mı(2)");
                int sebzeMenu = sc.nextInt();
                switch (sebzeMenu) {
                    case 1:
                        System.out.println("Roka Salarası 40 TL");
                        break;
                    case 2:
                        System.out.println("Enginar 30TL");
                        break;
                    default:
                        System.out.println("Hatalı bir giriş");
                }
                break;
            case 3:
                System.out.println("Patates Kızartması mı(1)\n  Makarna mı(2)");
                int cocukMenu = sc.nextInt();
                switch (cocukMenu) {
                    case 1:
                        System.out.println("Patates Kızartması 10 TL");
                        break;
                    case 2:
                        System.out.println("Makarna 5TL");
                        break;
                    default:
                        System.out.println("Hatalı bir giriş");
                }
                break;
            default:
                System.out.println("hatalı bir giri yaptınız");
        }

    }
}
