package lab_3_Arrays;

import java.util.Random;

public class Taks13_RandomArrayIkinciEnBuyyukSayi {
    public static void main(String[] args) {
        System.out.println("\n-------Sor13--------");
        System.out.println(randomArrayIkinciEnBuyuk());
    }
    /*
    Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
(Array.sort kullanılmayacak)
     */
    public static int randomArrayIkinciEnBuyuk() {
        Random random = new Random();
        int number[] = new int[500];
        int max = number[0];
        int max2 = number[0];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(120, 140);
            if (number[i] > max) {
                max = number[i];
            }
            if (max != number[i] && number[i] > max2) {
                max2 = number[i];
            }
        }
        return max2;
    }
}
