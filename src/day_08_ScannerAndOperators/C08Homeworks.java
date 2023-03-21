package day_08_ScannerAndOperators;

public class C08Homeworks {
    public static void main(String[] args) {

        System.out.println("------Task 1a-----\n");
        // 5*2+4+3-2*(1+2)+3
        int x = 5*2+4+3-2*(1+2)+3;//16
        System.out.println(x);
        //veya
        System.out.println(5*2+4+3-2*(1+2)+3);
        System.out.println("\n------Task 1b-----\n");
        // 1-2*(2+4)/2*(-2-1)
        int y = 1-2*(2+4)/2*(-2-1);//19
        System.out.println(y);
        //veya
        System.out.println(1-2*(2+4)/2*(-2-1));
        System.out.println("\n------Task 2-----\n");
        //Bir java programı yazın number1, number2,number3 ve
        //sum şeklinde 4 değişkenimiz olsun. Program sayıların
        //toplamını versin. Konsolda aşağıdaki gibi bir çıktı alın.
        int number1 =15;
        int number2 =25;
        int number3 =35;
        int sum = number1+number2+number3;
        System.out.println(number1+"+"+number2+"+"+number3+"="+sum);
       /* System.out.println("\n------Task 2-----\n");
        //Bir program yazın km yi mil cinsinden versin.
        //100=62,5 mil
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir km girin :");
        double km = sc.nextDouble();
        double oran = 62.5/100;
        double mil = km*oran;
        System.out.println(km + " km, "+mil+" mil'dir.");

        System.out.println("\n------Task 3-----\n");
        //Bir program yazın yarıçapı belirlediğinizde çemberin
        //çevresini ve dairenin alanını versin.

        System.out.println("Bir yarı çap giriniz");
        double radius = sc.nextDouble();
        double area = (Math.PI)*(Math.pow(radius,2));
        double circile = 2*radius*(Math.PI);
        System.out.println("Girilen yarı çap "+radius+" için\nDairenin alanı : "
        +area+"\nçevresi : "+circile);*/

        System.out.println("\n------Task 4-----\n");
        //(int)(5.1+5)+(int)(3.1)
        int s =(int)5.1+5;
        int s1=(int)3.1;
        int st= s1+s;
        System.out.println("st = " + st);
        //(double)(3+2)
        double s2 = 3+2;
        System.out.println("s2 = " + s2);
        //(int)(4.3+(double)(3/1)
        double s3 =3/1;
        int st1 = (int)(4.3)+(int)s3;
        System.out.println("st1 = " + st1);
        //(int)(10.3+11.4)
        int s5 = (int)(10.3+11.4);
        System.out.println("s5 = " + s5);
        //(double)(10/(int)(2.0))
        int s6= (int) 2.0;
        double s7 = 10/s6;
        System.out.println("s7 = " + s7);

    }
}
