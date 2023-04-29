package lab_3_Arrays;

public class Taks15_YalnizSayilar {
    public static void main(String[] args) {
        int[] x={2,3,3,4,5,6,5,6,3}; // 2,4,5,6,3
        int[] x2={2,3,5,8,8}; //2 3 5
        int[] x3={2,2,3}; // 3
        int[] x4={1,2}; // 1,2
        yalnizSayilar(x);
        yalnizSayilar(x2);
        yalnizSayilar(x3);
        yalnizSayilar(x4);
        System.out.println(aloneNumbers(x));
        System.out.println(aloneNumbers(x2));
        System.out.println(aloneNumbers(x3));
        System.out.println(aloneNumbers(x4));

    }
    /*
    Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
            [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
            [2,2,5,8,8] →5
            [2,2,3] → 3
            [1,2] → 1,2
            */
    public static void yalnizSayilar(int[] x){
        if(x[0] != x[1]){
            System.out.print(x[0]+" ");
        }
        if(x.length>=3){
        for (int k=0,i = 1,j=2; i < x.length-1;k++, i++,j++) {

            if (x[k] != x[i]&&x[i] != x[j]) {
                System.out.print(x[i]+" ");
            }
        }}
        if(x[x.length-2] != x[x.length-1]){
            System.out.print(x[x.length-1]+" ");
        }
        System.out.println("    ");
    }
    public static String aloneNumbers(int[] arr) {
        String result = "";
        /*for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1] && arr[i - 1] != arr[i + 1]) {
                result += arr[i] + " ";
            }
        }*/
        if (arr[0] != arr[1]) {
            result += arr[0] + " ";
        }
        if(arr.length>=3){
            for (int k=0,i = 1,j=2; i < arr.length-1;k++, i++,j++) {

                if (arr[k] != arr[i]&&arr[i] != arr[j]) {
                    result +=arr[i]+" ";
                }
            }}
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            result += arr[arr.length - 1] + " ";
        }
        return result;
    }
}
