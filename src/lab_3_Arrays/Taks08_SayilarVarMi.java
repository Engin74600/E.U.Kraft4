package lab_3_Arrays;

public class Taks08_SayilarVarMi {
    public static void main(String[] args) {
        System.out.println("\n-------Soru8--------");
        int[] numbers1 = {23, 54, 8, 96, 9, 41};
        int[] numbers2 = {22, 55, 7, 99, 6, 45};
        int[] numbers3 = {54, 96, 9};
        int[] num1 = {5,4,3,2,1};
        int[] num2 = {1,2,3,4,5,7,9};
        int[] num3 = {5,4,3,2,1,7,5};
        int[] num4 = {1,2,3,4,5};


        System.out.println(sayilarVarMi(numbers3, numbers1));
        System.out.println(sayilarVarMi(numbers1, numbers2));
        System.out.println(sayilarVarMi(num1, num2));
        System.out.println(sayilarVarMi(num3, num4));
    }
    /*
    Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
yer almıyorsa false yazdıran metodu yazınız.
[5,4,3,2,1] , [1,2,3,4,5,7,9] true
[5,4,3,2,1,7,5] , [1,2,3,4,5] false
     */
    public static boolean sayilarVarMi(int[] x, int[] y) {
       first: for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    continue first;
                }
            }
            return false;
        }
        return true;
    }
}
