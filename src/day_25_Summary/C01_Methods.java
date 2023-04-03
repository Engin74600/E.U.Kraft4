package day_25_Summary;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x = " + x);
        int y = sc.nextInt();
        System.out.println("y = " + y);
        //method içinde kullanıcıdan veri almakla uğraşma
        // method direk istenileni yaptırsın
        System.out.println("ornekMethod2(x,y) = " + ornekMethod2(x, y));
        ornekMethod2(x,y);*/
       // System.out.println("sonDeger(\"Merhaba\") = " + sonDeger1("Merhaba"));


    }
    public static void ornekMethod(int x,int y){
        System.out.println(x+y);
    }
    //void method sadece ayzdırı. omu bir değişken gibi kullanılmaz

    public static int ornekMethod2(int x,int y){
        System.out.println("merhaba");
        System.out.println("dünyalı");
        int z=x+y;
        return z;
    }
    public static char sonDeger(String str){
        char result='a';
        for (int i = 0; i <str.length() ; i++) {
            result=str.charAt(i);
        }
        return result;
    }



    public static int max(int a,int b){
        if (a>b){return a;}
        return b;
    }
    public static int sum(int a,int b){
        return a+b;
    }


}
