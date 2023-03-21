package day_06_Typse_Casting;

public class AritmeticOperators {
    public static void main(String[] args) {
        System.out.println("--------\n\tToplama\n");

        int x = 5;
        int y = 2;
        System.out.println(x+y);
        int z = x+y;
        System.out.println(z);

        System.out.println("--------\n\tÇıkarma\n");
        System.out.println(x-y);
        int z1 = x-y;
        System.out.println(z1);

        System.out.println("--------\n\tÇarpma\n");
        System.out.println(x*y);
        int z3=x*y;
        System.out.println(z3);
        System.out.println("harun"+x*y);//hata vermez
        // çünkü öncelik çarpma işleminde
        System.out.println("--------\n\tBölme\n");
        System.out.println(x/y);
        // her iki veri int/küçükken, işlemi double/büyük olmaz
        // giren verilerden herhangi birini genişletilirse/double olursa
        // sonuç da istediğimiz gibi geniş/doubel olabilir
        double z5=x/(double)z;
        System.out.println("z5 = " + z5);
        //veya
        double x1= 5;
        int y1 = 2;
        double z4=x1/y1;
        System.out.println("z4 = " + z4);

        System.out.println("--------\n\tMod\n");
        int t=x%y;
        System.out.println(t);

        System.out.println("--------\n\tAritmatic işlemlerde Öncelik\n");
        //>öncelik parantezde
        // >sonra bölme-çarpma-Mod birbiriyle denk
        //>sonra toplama -çıokarma
        // >denk işlemlerde sağdan sola

        int sayi = 3 + 5/2*4%(12-9);
        // 3+5/2*4%3
        //3+2*4%3
        //3+8%3
        //3+2
        //2






    }
}