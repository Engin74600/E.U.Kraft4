package my_litte_notbook;

import java.util.Scanner;

public class Scanner_Day08 {
    public static void main(String[] args) {
        //1. adım scanner objesi oluşturmak
        Scanner sc = new Scanner(System.in);
        // 2. kullanıcıyı bilgilendirme
        System.out.println("lütfen bir isim giriniz");
        // girilen bilgiyi içine koyabileceğimiz bir veriable oluşturun
        // oluşturulan değişkenin içine scanner objesi ile uygun methodu çağırın
        String name = sc.nextLine();//
        System.out.println("Girilen isim : " + name);

        sc.close(); // ile sc objesi kapatılır ki datada yer kaplamaz
    }

}
