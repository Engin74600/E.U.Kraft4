package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Random;

public class Taks10_RandomlaArayYapma {
    public static void main(String[] args) {
        System.out.println("\n-------Sor10--------");
        C04_Arrays_Methods.arrayYazdir(randomArray());
    }
    /*
    Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
     */
    public static int[] randomArray() {
        Random random = new Random();
        int number[] = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        return number;
    }
}
