package day_21_ClassAndObject;

public class C03_Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
        System.out.println("----------");
        System.out.println(fibonaccison(10));
    }

    public static void fibonacci(int n){
        int x=0;
        int y =1;
        int z;
        System.out.println(x+" ");
        System.out.println(y+" ");
        for (int i = 0; i <n-2 ; i++) {
            z=x+y;
            System.out.println(z+" ");
            x=y;
            y=z;

        }
    }
    public static int fibonaccison(int n){
        int x=0;
        int y =1;
        int z= 0;
        for (int i = 0; i <n-2 ; i++) {
            z=x+y;
            x=y;
            y=z;

        }
        return z;
    }
}
