package day_09_Operators;

public class C4_ShortHandOperators {
    public static void main(String[] args) {

        //assingment
        int num = 10;
        num =20;
        System.out.println("Number = "+num);

        String word = "Java Programing Language";
        System.out.println("word = "+word);
        word ="Golden Globe";

        System.out.println("--------\n");
        int x = 100;
        System.out.println("x = " + x);

        x+=100; //x=x+100

        String str = "Golden";
        str+=" Globe";
        System.out.println("str = " + str);
        System.out.println("-----");

        double num1 = 3.5;
        System.out.println("num1 = " + num1);

        num1 += 6.5;
        System.out.println("num1 = " + num1);
        System.out.println("-------");

        double bakiye = 3520.50;
        System.out.println("bakiye = " + bakiye);
        bakiye+=1500;
        System.out.println("bakiye = " + bakiye);
        bakiye-=2200;
        System.out.println("bakiye = " + bakiye);
        System.out.println("--------");

        double maas = 42500.50;
        System.out.println("maas = " + maas);
        maas *=2;
        System.out.println("maas = " + maas);
        double grAltin = 0.001;
        grAltin+=120;
        System.out.println("grAltin = " + grAltin);
        System.out.println("----------");
        double num2 = 50000.0;
        num2 /=2;
        System.out.println("num2 = " + num2);
        System.out.println("-----------");
        double num3 = 100;
        num3 %=3;
        System.out.println("num3 = " + num3);
        System.out.println("--------");

        int odanacak = 1130;
        System.out.println("odanacak = " + odanacak);
        int ikiyuzluk = 1130/200;
        System.out.println("ikiyuzluk = " + ikiyuzluk);
        odanacak%=200;
        System.out.println("odanacak = " + odanacak);
        int yuzluk = odanacak/100;
        System.out.println("yuzluk = " + yuzluk);
        odanacak %=100;
        System.out.println("odanacak = " + odanacak);
        int yirmilik = odanacak/20;
        odanacak %=20;
        int onluk = odanacak/10;
        odanacak%=10;
        System.out.println("1130 tl için "+ikiyuzluk+" tane ikiyüzlük, \n"
                +yuzluk+" tane yüzlük, "+yirmilik+" tane yirmilik, \n"+
                onluk+" tane onluk bankonıt ödememiz gerekiyor.");



    }
}
