package lab_3_Arrays;

public class Taks22_AsalSayilariBul {
    public static void main(String[] args) {
        System.out.println("\n----Soru22-----");
        int[] sayi={21,7,29,12};
        asalSayilar(sayi);

    }
    /*Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
[21,7,29,12] ----→ 7 29*/
    public static void asalSayilar(int[] x){
        for (int i = 0; i < x.length; i++) {

            if(asalMi(x[i])) {
                System.out.println(x[i]);
            }
        }
    }


    public static boolean asalMi(int x){
        int bolen=0;
        boolean result=false;
        for (int i = 2; i <=x ; i++) {//sıfır modu olmaz. o yüzden 1
            if(x%i==0){
                bolen++;
            }
        }
        if(bolen==1) {result= true;}
        return result;
    }
}
