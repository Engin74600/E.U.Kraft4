package day_04_VeriableCod;

public class Taks {
    public static void main(String[] args) {
        /*
        asks1: 1. Create a class called Triangle.java and print:

                                            ^
                                           / \
                                          /   \
                                         /     \
                                        /       \
                                        --------- */
        System.out.println("--------------\n>>>>Soru 1");
        System.out.println("    ^  ");
        System.out.println("   / \\ ");
        System.out.println("  /   \\");
        System.out.println(" /     \\");
        System.out.println("/       \\");
        System.out.println("---------");
        //2. DataTypesHomework adinda bir class olusturun ve asagidaki adimlari yapin
         //1- Değeri 'true' olan bir boolean oluşturunuz. Boolean'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.1");
        boolean bl = true;
        System.out.println("bl = " + bl);
        //2- Değeri 10.01 olan bir double oluşturunuz. Double'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.2");
        double db = 10.01;
        System.out.println("db = " + db);
        //3- Değer i 'false' olan bir boolean oluşturunuz. Boolean'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.3");
        boolean bl1 = false;
        System.out.println("bl1 = " + bl1);
        //4- Değeri 5 olan bir byte oluşturun. Bu byte'ı yazdırın.
        System.out.println("--------------\n>>>>Soru 2.4");
        byte by = 5;
        System.out.println("by = " + by);
        //5- Değeri -4 olan bir byte oluşturun. Bu byte'ı yazdırın.
        System.out.println("--------------\n>>>>Soru 2.5");
        byte by1 = -4;
        System.out.println("by1 = " + by1);
        //6- Değeri a olan bir char oluşturun. Bu char'ı yazdırın.
        System.out.println("--------------\n>>>>Soru 2.6");
        char ch = 'a';
        System.out.println("ch = " + ch);
        //7- Değeri z olan bir char oluşturun. Bu char'ı yazdırın.
        System.out.println("--------------\n>>>>Soru 2.7");
        char ch1 = 'z';
        System.out.println("ch1 = " + ch1);
        // 8- Değeri & olan bir char oluşturun. Bu char'ı yazdırın.
        System.out.println("--------------\n>>>>Soru 2.8");
        char ch2 = '&';
        System.out.println("ch2 = " + ch2);
        //9- Değeri 120 olan bir double oluşturunuz. Double' ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.9");
        double db1 = 120;
        System.out.println("db1 = " + db1);
        //10-Değeri 120.005 olan bir double oluşturunuz.Double'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.10");
        double db2 = 120.005;
        System.out.println("db2 = " + db2);
        //11-Değeri 550.24  olan bir double oluşturunuz.Double'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.11");
        double db3 = 550.24;
        System.out.println("db3 = " + db3);
        //12-Değeri 121.005f olan bir float oluşturunuz.Float'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.12");
        float f = 121.005f;
        System.out.println("f = " + f);
        //13-Değeri 123.3365f olan bir float oluşturunuz.Float'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.13");
        float f1 = 123.2265F;
        System.out.println("f1 = " + f1);
        //14-Değeri 3.55f olan bir float oluşturunuz.Float'ı yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.14");
        float f2 = 3.55f;
        System.out.println("f2 = " + f2);
        //15-Değeri 15 olan bir int oluşturun.Int'i yazdırın.
        System.out.println("--------------\n>>>>Soru 2.15");
        int i = 15;
        System.out.println("i = " + i);
        //16-Değeri 100 olan bir int oluştur.Ve bu int 'i yazdır.
        System.out.println("--------------\n>>>>Soru 2.16");
        int i1 = 100;
        System.out.println("i = " + i);
        //17-Değeri 120 olan bir int oluşturın.Int'i yazdırın.
        System.out.println("--------------\n>>>>Soru 2.17");
        int i2 = 120;
        System.out.println("i2 = " + i2);
        //18-Değeri -6500 olan bir int oluşturunuz.Int'i yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.18");
        int i3 = -6500;
        System.out.println("i3 = " + i3);
        //19-Değeri 12 olan bir short oluşturunuz.Short'u yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.19");
        short s = 12;
        System.out.println("s = " + s);
        //20-Değeri 23 olan bir short oluşturunuz.Short'u yazdırınız.
        System.out.println("--------------\n>>>>Soru 2.20");
        short s1 = 23;
        System.out.println("s1 = " + s1);
        //21-Değeri -100 olan bir short oluşturun.Short'u yazdırın.
        System.out.println("--------------\n>>>>Soru 2.22");
        short s2 = -100;
        System.out.println("s2 = " + s2);

                    /*3. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                                            length
                                            width

                                            area = length * width
                                            perimeter =  2 * (length + width)

                   4. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
                                        Hints: 1 gallon = 3.79 litters

                   5. Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
                                        Hints: 1 kg = 2.2 pounds

                   6. Create a class called StudentInfo, and dclare variables for the followings:
                                    1. student name (String)
                                    2. age (int)
                                    3. gender (char)
                                    4. school name (String)
                                    5. phone number (String) (###)-###-####
                                    6. full time (boolean)
                      10- LPG, motorin, gasoline yakıt tiplerini tek satırda string türünde
tanımlayın(declare).*/
        System.out.println("--------------\n>>>>Soru 10");
        String LPG, Motorin, Gasolin;
        /*
                      11- Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
İfadesini bir değişkene atayın ve yıl başka bir değişken ile
kontrol edilebilsin.*/

        System.out.println("--------------\n>>>>Soru 11");
        int yil = 1453;
        System.out.println("Fatih Sultan Mehmet "+yil+" yılında İstanbul'u fethetmiştir.");
        /*
                      12- Bir program yazın. Yarıçapı (radius) x olan çemberin
alanını versin. Yarıçap(radius) ve alan(area) olmak üzere 2 değişken
oluşturun. Reminder: Pi=3.14*/

        System.out.println("--------------\n>>>>Soru 12");
        double radius = 32.5;
        double PI = 3.14;
        double area = PI * radius*radius;
        System.out.println("area = " + area);



    }
}
