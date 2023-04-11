package day_31_Arrays_1;

public class C03_Array_2 {
    public static void main(String[] args) {

        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;
        System.out.println( array.length);// böylelikle array'in kapasitesini görebiliriz
        System.out.println("-------------");
        for (int i = 0; i <5 ; i++) {//tüm array indeksleri görmek için
            System.out.println(array[i]+" ");
        }
        System.out.println("-------------");
        for (int x:array) {// foreach ile yaptık. bir değişkenle tüm array indekslerini görmek için
            //x=array[0] 1. döngü
            //x=array[1] 2. döngü
            //x=array[2] 3. döngü
            //x=array[3] 4. döngü
            //x=array[4] 5. döngü
            System.out.println(x+" ");
        }
        System.out.println("---------");
        int ciftsayi = 0;
        for (int x:array) {
            if (x%2==0){
                ciftsayi++;
            }
        }
        System.out.println("Çift sayı "+ciftsayi);
        System.out.println("----------");
        int teksayi=0;
        for (int x:array) {
            if (x%2!=0){
                teksayi++;
            }
        }
        System.out.println("Tek sayı "+teksayi);
        // arrayleri toplayan foreach yaz
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("sum = " + sum);

        int arraytoplam=0;
        for (int x:array) {
            arraytoplam+=x;
        }
        System.out.println("Array Toplam = " + arraytoplam);
    }

}
