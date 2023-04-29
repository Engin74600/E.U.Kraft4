package lab_3_Arrays;

public class Taks17_DublicateVarMi {
    public static void main(String[] args) {
        System.out.println("\n-------Sor17--------");
        int[] numbers4 = {1, 2, 2, 3, 4, 3, 11, 23};
        int[] numbers7 = {1, 3, 2, 4, 0, 11, 23};
        System.out.println(dublicateVarMi(numbers4));
        System.out.println(dublicateVarMi(numbers7));
    }
    public static boolean dublicateVarMi(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
