package day_13_ForLoops;

import java.util.Scanner;

public class C03_PozotiveNegativeTernary {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive Number");
        } else if (n>0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        System.out.println("------- Ternary");
        String resault = n>0 ? "pozitive number" : n<0 ? "negative number" : "Zero";
        System.out.println(resault);
    }
}
