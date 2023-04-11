package day_31_Arrays_1;

public class C02_Array_1 {
    public static void main(String[] args) {

        /*Array en bariz özelliği
                1) sınırlı sayıda kapasite
                2) aynı türede olması
                */

        //Array tanımlama yolu
        //1)
        String[] y = new String[6];
        // y değişkenine en fazla 6 adet ve sadece string atayabilrsin
        //2))
        int z[] = new int[5];
        //3)
        int t[];
        t= new int[3];
        //4)
        String str2[]={"ali","veli","deli","ne eyledi"};
        /*arka planda "String[] str2 = new String[4];" yapmış oluyoruz
        str2[0]="ali"
        str2[1]="veli"
        str2[2]="deli"
        str2[3]="ne eyledi"
        */

        int[] arry; //declaring
        arry = new int[5];//instantiting
        //veya
        int[] arry1 = new int[5];

        int[] a;
        //veya
        int b[];

        z[0]=105;
        z[1]=89;
        z[2]=63;
        z[3]=56;
        z[4]=107;
        System.out.println(z[1]);

        String str[]=new String[3];
        str [0] = "Harun";
        str [1] = "Mahmut";
        str [2] = "Mustafa";
        System.out.println(str[2]);
        System.out.println(str[2].concat(str[1]).length());

        // 2 değer alan int türünde array oluştur
        // ve değerleri toplayıp yazdırın
        int i[]=new int[2];
        i [0]=89;
        i [1]=105;
        int toplam = i[0]+i[1];
        System.out.println("toplam = " + toplam);
        // veya
        int [] i2 ={89,105};
        int toplam2=i2[0]+i2[1];
        System.out.println("toplam2 = " + toplam2);


    }
}
