package lab_3_Arrays;

public class Taks14_ArdisikUcSayiVarMi {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        int[] num2 = {2, 4, 5, 8, 8};
        int[] num3 = {1, 2, 3};
        int[] num4 = {2, 3};

        System.out.println(ardisikUcSayiVarMi(num1));
        System.out.println(ardisikUcSayiVarMi(num2));
        System.out.println(ardisikUcSayiVarMi(num3));
        System.out.println(ardisikUcSayiVarMi(num4));
    }

    /*Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
[2,3,3,4,5,6,5,6,3] → true
        [2,4,5,8,8] → false
        [1,2,3] → true
        [1,2] → false*/
    public static boolean ardisikUcSayiVarMi(int[] x) {

        for (int i = 0, j = 1, k = 2; i < x.length - 2; i++) {
            if (x[i] + 1 == x[j] && x[j] + 1 == x[k]) {
                return true;
            }
            j++;
            k++;
        }
        return false;
    }

}
