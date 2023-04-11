package mentöring;

public class Day15_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));//direk sonucu yazdırır
        int n =7;
        for (int i = 0; i <n ; i++) {
            System.out.println(fibonacci(i)+" ");// tüm aşamaları yazdırır

        }

    }
   //fibonacci yazılacak
    //dönüş tipi long olacak


    //bu iç içe kendisinin döndüğü methodlar işlemciyi yorar
    public static long fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
