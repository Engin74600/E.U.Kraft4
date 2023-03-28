package day_20_CustomMethodsOverloading;

import java.util.Scanner;

public class Taks_SayiToplama_Donusturma {
    public static void main(String[] args) {
        toplama();
    }

    public static void toplama() {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen tolopla işlemi için 2 sayı girin");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        if (sayi2 % 3 == 0) {
            result(sayi1, sayi2);
        } else if (sayi2 % 3 != 0) {
            result(sayi1, multipleOfThree(sayi2));
        }
    }

    public static int multipleOfThree(int i) {

        if (i % 3 == 1) {
            i -= 1;
        } else if (i % 3 == 2) {
            i += 1;
        }
        return i;
    }

    public static void result(int a, int b) {
        int sonuc = (a + b);
        System.out.println("Sonuç = " + sonuc);
    }
}