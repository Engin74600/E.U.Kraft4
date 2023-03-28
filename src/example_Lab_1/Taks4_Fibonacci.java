package example_Lab_1;

import java.util.Scanner;

public class Taks4_Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nterimsayisi=sc.nextInt();
        fibonacci(nterimsayisi);
    }
    //Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5
    //8 13 24

    public static void fibonacci(int a){

        for (int i = 0; i <a; i++) {
           int x=0;
           int y=1;
            int degisim=x+y;
           if (false){
           degisim=x;
           x=y;
           y=degisim;
           }
            System.out.println(degisim);
        }

    }
}
