package day_17_Methods;

public class C01_Summary {
    public static void main(String[] args) {
        // 1 v 100 dail yazdısın,
        //30-50 haric
        for (int i = 0; i <= 100; i++) {
            if (i > 30 && i < 50) {
                continue;
            }
            System.out.print(i + " ");
        }

        // 1 v 100 dail yazdısın,
        //13e bölünmeyenleri
        for (int i = 0; i <= 100; i++) {
            if (i%13==0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
