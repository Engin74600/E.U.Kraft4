package lab_3_Arrays;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Random;

public class Taks11_RandomlaArrayYapma2 {
    public static void main(String[] args) {

        System.out.println("\n-------Sor11--------");
        C04_Arrays_Methods.arrayYazdir(randomArray500());
    }
        /*
    Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
arasında rasgele sayılar atayın.
     */
        public static int[] randomArray500() {
            Random random = new Random();
            int number[] = new int[500];
            for (int i = 0; i < number.length; i++) {
                number[i] = random.nextInt(50, 80);
            }
            return number;
        }

}
