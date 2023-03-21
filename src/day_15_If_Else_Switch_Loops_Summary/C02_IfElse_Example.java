package day_15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C02_IfElse_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        TASK
Not aralığı Harf karşılığı
85-100 A
70-85 B
55-70 C
40-55 D
0-40 F
         */
        System.out.println("-----hocanın ki");

        int not1 =84;
        String str="";
        if (not1>=0 && not1<40){
            str = "F";
        } else if (not1>=40 && not1<55) {
            str = "D";
        } else if (not1>=55 && not1<70) {
            str = "C";
        } else if (not1>=70 && not1<85) {
            str = "B";
        } else if (not1>=85 && not1<=100){
            str = "A";
        } else {
            System.out.println("hatalı giriş");
        }
        if (!str.equals(""))
        System.out.println(str);

        System.out.println("-------benimki--");


        System.out.print("Ders notu girin :");
        double not = sc.nextDouble();
        if (not<40){
            System.out.println("F aldınız!");
        } else if (not<55){
            System.out.println("D aldınız!");
        }else if (not<70){
            System.out.println("C aldınız!");
        }else if (not<85){
            System.out.println("B aldınız!");
        }else if (not<=100){
            System.out.println("A aldınız!");
        }else {
            System.out.println("Yanlış bir not girdiniz");
        }
    }
}
