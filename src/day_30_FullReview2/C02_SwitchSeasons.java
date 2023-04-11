package day_30_FullReview2;

import java.util.Scanner;

public class C02_SwitchSeasons {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the month number as an integer (1-12)");
        int month=sc.nextInt();
        System.out.println("wichSeason(month) = " + wichSeason(month));

    }
    /*
    // Write a method that takes the month number from the user and returns the season.
     */
    public static String wichSeason(int month){
        String season="";
        switch (month){
            case 12:
            case 1:
            case 2:
                season="Winter";
                break;
            case 3:
            case 4:
            case 5:
                season="Spring";
                break;
            case 6:
            case 7:
            case 8:
                season="Summer";
                break;
            case 9:
            case 10:
            case 11:
                season="fall";
                break;
            default:
                season="Imvalid Month Number";
        }
        return season;
    }
}
