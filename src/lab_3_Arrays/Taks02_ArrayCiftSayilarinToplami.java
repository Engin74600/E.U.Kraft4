package lab_3_Arrays;

public class Taks02_ArrayCiftSayilarinToplami {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,3,3};
        System.out.println(sumOfEvenElements(numbers));

    }
    //Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int sumOfEvenElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
