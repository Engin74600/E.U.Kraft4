package lab_3_Arrays;

import java.util.Random;

public class Taks12_RandomArrayKaçAdetVar {
    public static void main(String[] args) {
        System.out.println("\n-------Sor12--------");
        System.out.println(randomArray500deVarMi(125));
    }
    /*
   Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
    */
    public static int randomArray500deVarMi(int x) {
        Random random = new Random();
        int number[] = new int[500];
        int adet = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(120, 140);
            if (number[i] == x) {
                adet++;
            }
        }
        return adet;
    }
}
