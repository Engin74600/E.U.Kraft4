package day_06_Typse_Casting;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        >>byte, short, int, long, float; double,
        >> char
        >> boolean

         */
        byte b = 125;
        short s = b;
        b=(byte)s;//büyük veriyi küçüğe tayin ederken
        // veri kaybı olacağı için
        //bizim bunu teyit etmemiz lazım
        System.out.println("s = " + s);
        System.out.println("---------\n");

        int i =10;
        double d=20;
        d=i;
        i=(int)d;
        System.out.println("d = " + d);
        System.out.println("-----------\n");

        float f = 2.5f;
        i= (int)f;
        System.out.println("i = " + i);

        byte x = 10;
        byte y = 20;
        byte z=(byte)(x+y);// yapılan işlem int'e denk geliyor,
        //byte devam etmek istersek brlitmrm gerekir

        short a = 5;
        short b1 = 10;
        short c = (short) (b1+a);

        double x1 = 5.2;
        int y1 = 2;
        int c1 = (int)(y1+x1);//??



    }
}
