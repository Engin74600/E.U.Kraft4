package lab_3_Arrays;


import java.util.Arrays;

public class Taks23_ArrayDegerleriniSirala {
    public static void main(String[] args) {
        int[] sayi={21,7,29,12,23,45,32,53};
        System.out.println(Arrays.toString(sortNumbers(sayi)));

    }
    /*
    Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
[21,7,29,12] ----→ [7,12,21,29]
     */
    public static int[] sortNumbers (int [] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] <arr[i]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
