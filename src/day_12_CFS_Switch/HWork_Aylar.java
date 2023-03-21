package day_12_CFS_Switch;

import java.util.Scanner;

public class HWork_Aylar {
    public static void main(String[] args) {
        /*TASK
        Order Aylar
        1 January
        2 February
        3 March
        4 April
        5 May
        6 June
        7 July
        8 August
        9 September
        10 October
        11 November
        12 December*/
        System.out.println("Kaçıncı aydayız?");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız");
        }
    }
}
