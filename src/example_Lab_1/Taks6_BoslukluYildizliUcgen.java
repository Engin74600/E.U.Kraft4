package example_Lab_1;

import java.util.Scanner;

public class Taks6_BoslukluYildizliUcgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yıldızlı üçgen için satır sayısı girin : ");
        int satirsayisi= sc.nextInt();
        starTriangle(satirsayisi);

    }

    /**
     * A method that creates a triangle from ystars with the number of lines it receives from the user
     * @param a
     */
    public static void starTriangle(int a){
        for (int i = a; i >0; i--) {//satır sayısı
            int yildiz=a+1;
            for (int j = 0; j < i ; j++) {//b0şluk döngüsü
                System.out.print(" ");
            }
            for (int k = yildiz-i; k >0 ; k--) {//yıldız föngüsü
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
