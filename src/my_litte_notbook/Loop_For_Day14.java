package my_litte_notbook;

public class Loop_For_Day14 {
    public static void main(String[] args) {
        for (int i = 1; i <21; i++) {
            //  Atama;şart;artırma
            System.out.println(i + ". \"Merhaba Dünya\"");
        }
        for (int i = 0; i < 3; i++) {

            System.out.println("Merhaba");
        }
        for (int i = 0, k = 5; i < 3; i++, k += 5) {
            // i=0 ve k==5;ien fazla 2 olacak;
            // i bir bir artacak,k her döngüde 5le toplanacak
            System.out.println(k);//i kadar döngü olacak
            // k'yı yazdırdığımız için de döngü kadar 5 ile toplanacak
        }
        for (int i = 0, k = 5; i <= 3&&k<=25; i++, k += 5) {
            // i=0 ve k==5;ien fazla 2 olacak;
            // i bir bir artacak,k her döngüde 5le toplanacak
            System.out.println(k);//i kadar döngü olacak
            // k'yı yazdırdığımız için de döngü kadar 5 ile toplanacak
        }
    }
}
