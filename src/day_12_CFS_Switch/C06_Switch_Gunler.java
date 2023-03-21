package day_12_CFS_Switch;

import java.util.Scanner;

public class C06_Switch_Gunler {
    public static void main(String[] args) {
        // haftanın günü kullanıcadan alın ve yazdırın
        System.out.println("haftanın kaçıncı günündeyiz?");
        Scanner sc = new Scanner(System.in);
        int weekDay = sc.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız");
        }
    }
}
