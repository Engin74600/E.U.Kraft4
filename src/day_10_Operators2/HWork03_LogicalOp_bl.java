package day_10_Operators2;

public class HWork03_LogicalOp_bl {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        boolean bl = (a > b) && (b == 7); // False
        //          false && True
        System.out.println("bl 1. sonuç = " + bl);
        bl = a / b > 0 || b > a; // True
        //   false || true
        System.out.println("bl 2. sonuç = " + bl);
        bl = a - b > 0 && b > a; // False
        //   false && True
        System.out.println("bl 3. sonuç = " + bl);
    }
}
