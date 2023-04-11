package day_29_FullReview1;

import java.util.Scanner;

public class C02_CustomMethodsReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isEven(num)){
            System.out.println(num + " is an Even number");
        }

        System.out.println("-------------");
        System.out.println(ageOfPerson(1983));

        System.out.println("--------------");
        System.out.println(printNumbers(55,63));
    }

    public static boolean isEven(int num){
        return num%2==0? true: false;
    }

    public static int ageOfPerson(int birthYear){
        return 2023-birthYear;
    }

    public static String printNumbers(int X, int Y){
        String result="";
        for (int i=X+1; i<Y;i++){
            result +=i+" ";
        }
        return result;
    }
}
