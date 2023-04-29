package lab_3_Arrays;

public class Taks04_ArraydekiEnBuyukVeKucuk {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 3};

        System.out.println("\n-------Soru4--------");
        System.out.println(arryMaxAndMin(numbers));

    }
    /*Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort
    kullanılmayacak)*/
    public static String arryMaxAndMin(int[] x) {
        int max = x[0];
        int min = x[0];
        String result = "";
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            } else if (min > x[i]) {
                min = x[i];
            }
        }
        result = "En büyük sasyı : " + max + "\nen küçük sayısı : " + min;
        return result;
    }
}
