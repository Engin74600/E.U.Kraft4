package day_20_CustomMethodsOverloading;

public class C02_SumOfNumber {
    public static void main(String[] args) {
        int sum1 =sumOf2Numbers(11,22);
        System.out.println("sum1 = " + sum1);
        int sum2 = sumOf3Numbers(11,22,33);
        System.out.println("sum2 = " + sum2);
        int sum3 = sumOf4numbers(11,22,33,44);
        System.out.println("sum3 = " + sum3);


    }
/**
 *  a method that can find the sum of two numbers
 * @param a
 * @param b
 */

public static int sumOf2Numbers(int a,int b) {
    return a + b;
}

    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     * @param c
     */
        public static int sumOf3Numbers(int a,int b,int c) {
            return a + b + c;
        }

    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     * @param c
     */
    public static int sumOf4numbers(int a,int b,int c,int d) {
        return a + b + c + d;
    }



}
