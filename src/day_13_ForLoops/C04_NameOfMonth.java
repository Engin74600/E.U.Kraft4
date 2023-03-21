package day_13_ForLoops;

import java.util.Scanner;

public class C04_NameOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between [1-12] :");
        int n = sc.nextInt();
        String result = "";
        if (n>=1 && n<=12 ){
            switch (n) {
                case 1:
                    result = "January";
                    break;
                case 2:
                    result = "February";
                    break;
                case 3:
                    result = "March";
                    break;
                case 4:
                    result = "April";
                    break;
                case 5:
                    result = "May";
                    break;
                case 6:
                    result = "june";
                    break;
                case 7:
                    result = "July";
                    break;
                case 8:
                    result = "August";
                    break;
                case 9:
                    result = "September";
                    break;
                case 10:
                    result = "October";
                    break;
                case 11:
                    result = "November";
                    break;
                case 12:
                    result = "December";
                    break;
            }

        }else {
            System.out.println("The number is invalid");
        }
        System.out.println(result);
        System.out.println("------------");
        String nemaOfMonth = (n>=1 && n <= 12)? (n==1)?"January": (n==2)?"":
                (n==3)?"February":(n==4)?"April":(n==5)?"May":
                (n==6)?"June":(n==7)?"jully":(n==8)?"August":
                        (n==9)?"September":(n==10)?"October":(n==11)?"November":
                                "Dcember":"invalid Number";
        System.out.println("Name Of Month = " + nemaOfMonth);
    }
}
