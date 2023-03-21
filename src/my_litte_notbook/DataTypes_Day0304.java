package my_litte_notbook;

public class DataTypes_Day0304 {
    public static void main(String[] args) {
            System.out.println("\n-----BYTE----");
            byte age = 35;
            //değişken adları küçük harf olur
            age = 45;
            System.out.println(age); //45
            //bir değişkene verilen en son değer geçerlidir.

            System.out.println("\n----SHORT----");
            short weight = 130;
            System.out.println(weight);

            System.out.println("\n-----İNT-----");
            int salary = 100000;
            System.out.println(salary);

            System.out.println("\n-----LONG----");
            long population = 8000000000L;
            // byte-short-int data taypların hepsi int olarak değerlendirilir
            // şayet long'ta bi değer yazacaksak muhakkak
            //değerin sonuna büyük veya küçük L/l koymalıyız
            System.out.println(population);
            population = 8_015_000_000l; //böyle de yazılabilir.
            System.out.println(population);

            System.out.println("\n-----CHAR----");
            char ch1 = 'A';
            System.out.println(ch1);

            System.out.println("\n-----STRİNG----");
            String str1 = "Java Master";
            System.out.println(str1);

            System.out.println("\n-----FLOAT----");
            //Pi =3,14
            float num4 = 3.14f;//flot Double değerin küçüğü olduğu için
            //ondan ayırmak adına atanan değerin sonuna F/f işareti koyulmalı
            System.out.println(num4);

            System.out.println("\n-----DOUBLE----");
            double PI = 3.14; // Pi sayısı atanan bir değer değil
            // Bi sabit olduğu için İntelij'de büyük harfle PI olarak yazılır.
            // bu bir teyamüldür.
            System.out.println(PI);
            System.out.println("PI = " + PI);
        }
    }