package day_20_CustomMethodsOverloading;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        int sum1= sum(11,22);
        System.out.println("sum1 = " + sum1);
        int sum2 = sum(11,22,33);
        System.out.println("sum2 = " + sum2);
        int sum3 = sum(11,22,33,44);
        System.out.println("sum3 = " + sum3);
        double sum4 =sum(1.1,2.2);
        System.out.println("sum4 = " + sum4);
        double sum5 = sum (1.1,2.2,3.3);
        System.out.println("sum5 = " + sum5);
        double sum6 = sum (1.1,2.2,3.3,4.4);
        System.out.println("sum6 = " + sum6);


    }

    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     */

    public static int sum(int a,int b) {
        return a + b;
    }
    /**
     *  a method that can find the sum of two doubles numbers
     * @param a
     * @param b
     */

    public static double sum(double a,double b) {
        return a + b;
    }

    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     * @param c
     */
    public static int sum(int a,int b,int c) {
        return a + b + c;
    }
    /**
     *  a method that can find the sum of two double numbers
     * @param a
     * @param b
     * @param c
     */
    public static double sum(double a,double b,double c) {
        return a + b + c;
    }

    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static int sum(int a,int b,int c,int d) {
        return a + b + c + d;
    }
    /**
     *  a method that can find the sum of two numbers
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static double sum(double a,double b,double c,double d) {
        return a + b + c + d;
    }
}
