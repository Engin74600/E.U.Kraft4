package lab_3_Arrays;

public class Taks24_S {
    public static void main(String[] args) {
        int[] num1={1,1,2,3};
        int[] num2={2,5,5,5,9};
        int[] num3={5,5,5,5,9};
        int[] num4={5,5,5,5,5};
        int[] num5={5,1,5,1,5};
        System.out.println(dublicateOlmayanlariTopla(num1));
        System.out.println(dublicateOlmayanlariTopla(num2));
        System.out.println(dublicateOlmayanlariTopla(num3));
        System.out.println(dublicateOlmayanlariTopla(num4));
        System.out.println(dublicateOlmayanlariTopla(num5));

    }
    /*
    Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
toplamını veren metodu yazınız.
[1,1,2,3] → 5
[2,5,5,5,9] →11
[5,5,5,5,9] →9
[5,5,5,5,5] →0
[5,1,5,1,5] →17
     */

    public static int dublicateOlmayanlariTopla(int[] arr) {
        int result=0;
        out:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j&&arr[i]==arr[j]){

                    continue out;
                }
            }result+=arr[i];
        }
        return result;
    }
}
