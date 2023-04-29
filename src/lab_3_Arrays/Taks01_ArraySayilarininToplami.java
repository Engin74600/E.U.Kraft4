package lab_3_Arrays;

public class Taks01_ArraySayilarininToplami {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,3,3};
        System.out.println(sumOfArrayElements(numbers));

    }
    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static double sumOfArrayElements(double[] arr){
        double sum=0;
        for (double i : arr) {
            sum+=i;
        }
        return sum;
    }
}
