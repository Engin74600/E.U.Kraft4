package my_litte_notbook;

public class C_F_S_If_Else_ElseIf_Day11 {
    public static void main(String[] args) {
        // a v b 2 int sayı karşılastırın
        // a>b'den büyük
        //a<bden
        // a =b
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A büyüktür B'den.");
        } else if (a == b) {
            System.out.println("A eşittir B'ye");
        } else {
            System.out.println("A küçüktür B'den");
        }
        int x = 10, y;
        if (x == 10) {
            y = 20;
        } else {
            y = 0;
        }
        System.out.println("y = " + y);
        /*
        veya
        int x = 10, y=0;
        if (x == 10) {
            y = 20;
        }
        System.out.println("y = " + y);
         */
        /*int x = 10, y=0;
        if (x == 10) {
            y = 20;
        } if (x==20){
            y=30;
        }if (x==30){
            y=40;
        }*/
        // bu şekil tavsiye edilmez. çünkü
        // doğruyu bulsa dahi her if içine girer
        // fazladan zaman v iş olur
        //bunun yerine else if olursa devamda doğrudan sonra çıkar

        String str;// string'i şayet if bloğu içinde
        //tanımlarsak sadece orada kullanırız. o yüzden
        //dışarda, öncesinde tanımlıyoruz
        int degree = 20;
        if (degree >= 20) {
            str = "Butterfly Flies";
        } else {
            str = "";
        }
        System.out.println(str);

        // Ayşenin cep harçlığı 5 liradan daha az ise
        // babası ona 10 tl verecek
        int aysepara = 4;
        if (aysepara < 5) {
            aysepara += 10;
        }
        System.out.println("aysepara = " + aysepara);

        // 2 sayıdan hangisi büyükse onu versin
        int c = 10;
        int v = 15;
        if (c > v) {
            System.out.println(c);
        } else {
            System.out.println(v);

        }
// 3 değişken alalım
        // a + b >C ise a-b'yi cye atayalım
       /* int a1 = 20,b1=30,c1=30;
        if ((a1+b1)>c1){
            //c1=Math.abs((a1-b1));
            //c1=Math.max(a1,b1)-Math.min(a1,b1);
            if ((a1-b1)>=0){
                c1=a1-b1;
            }else{
                //c=-(a1-b1)
                c1=b1-a1;
            }

        }
        System.out.println("c1 = " + c1);*/

        // 3 açı alalım
        // üçgen mi bakalım
        int k = 30;
        int l = 60;
        int m = 200;
       /* if ((k+l+m)==180){
            System.out.println("bu bir üçgendir");
        }else {
            System.out.println("üçgen değidir");
        }*/
        if ((k + l + m) == 180) {
            if (k == 90 || m == 90 || l == 90) {
                System.out.println("bu bir dik üçgendir");
            } else {
                System.out.println("Bu bir üçgendir");
            }
        } else {
            System.out.println("bu bir üçgen değil");
        }

    }
}
