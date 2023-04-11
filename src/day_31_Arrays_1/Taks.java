package day_31_Arrays_1;

public class Taks {
    public static void main(String[] args) {
        System.out.println("----Soru 1-----");
        int [] x ={15,1,4,23,45,53};
        int [] x1 ={3,4,5,6,7};
        System.out.println("buyukMu(x) = " + buyukMu(x));
        System.out.println("buyukMu(x1) = " + buyukMu(x1));

        System.out.println("\n----Soru 2-----");
        System.out.println("varMi(x) = " + varMi(x));
        System.out.println("varMi(x1) = " + varMi(x1));

        System.out.println("\n----Soru 3-----");
        int[] x2={15,2,4,88,456};
        System.out.println("esitMi(x,x1) = " + esitMi(x, x1));
        System.out.println("esitMi(x,x2) = " + esitMi(x, x2));

        System.out.println("\n----Soru 4-----");//hata veriyor
        System.out.println("yeniArray(x,x1) = " + yeniArray(x, x1));
        String[] str={"Ali","Veli","Deli"};
        String[] str1={"Hoş","Koş","Boş","Koç"};
        System.out.println("yeniArray(str,str1) = " + yeniArray(str, str1));

        System.out.println("\n----Soru 5-----");
        System.out.println("arrayToplam(x) = " + arrayToplam(x));
        System.out.println("arrayToplam(x1) = " + arrayToplam(x1));
        System.out.println("arrayToplam2(x) = " + arrayToplam2(x));
        System.out.println("arrayToplam2(x1) = " + arrayToplam2(x1));


    }

    // soru 1) Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean buyukMu(int[]x){
        if (x.length>5) {
            return true;
        }
        return false;
    }
    // soru 2) Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin
    public static boolean varMi(int[] x){
        int kontrol=0;
        for (int i = 0; i <x.length ; i++) {
            if (x[i] == 5) {
                return true;
            }
        }
        return false;
    }
    // soru3) Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün
    public static boolean esitMi(int[]x,int[]y){
        if (x[0] == y[0]) {
            return true;
        }
        return false;
    }
    // Soru 4) 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün
    public static int [] yeniArray(int[]x,int[]y){
        //Böyle hata verdi
         //int[] t ={x[0],y[0]};
        //System.out.println("t = " + t); adres veriyor
        int a=x[0];
        int b=y[0];
        //Bunları kabul ediyor.
        int[] t=new int[2];
        t[0]=a;
        System.out.println(t[0]);
        t[1]=b;
         return t;
    }
    public static String [] yeniArray(String[]a,String[]b){
        String x=a[0];
        String y=b[0];
        String[] t= new String[2];
        t[0]=x;
        t[1]=y;
        return t;
    }
    // Soru 5) Int array in elemanlarının toplamını veren bir method yazın
    public static int arrayToplam(int[] x){
        int sum=0;
        for (int i = 0; i < x.length ; i++) {
            sum+=x[i];
        }
        return sum;
    }
    public static int arrayToplam2(int[] x){
        int sum=0;
        for (int a:x) {
            sum+=a;
        }
        return sum;
    }

}
