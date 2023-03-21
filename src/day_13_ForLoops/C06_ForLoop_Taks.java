package day_13_ForLoops;

public class C06_ForLoop_Taks {
    public static void main(String[] args) {
        System.out.println("---Taks 1---\n");
        //0 dan 100 e kadar olan sayıları ekrana yazdırın.
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n---Taks 2---\n");
        // 15 den 100 e kadar olan sayıları ekrana yazdırın.
        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n---Taks 3---\n");
        // 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99
        //98 97 vs)
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n---Taks 4---\n");
        //0 dan 100 e kadar olan çift sayıları ekrana yazdırın.
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n---Taks 5---\n");
        //0 dan 100 e kadar olan tek sayıları ekrana yazdırın.
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n---Taks 6---\n");
        // bir program yazın ve 1-100 arasındaki sayıların toplamını
        // konsola yazdırsın
        int sum =0;
        for (int i=1 ; i<=100; i++){
            sum+=i;//sum=sum +i
        }
        System.out.println("Sum = "+sum);//döngünün içinde olursa
        // her toplamıAYRI AYRI YAZDIRIR
        //DIŞI OLURSA SON TOPLAMI ALIR


        System.out.println("\n---Taks 7---\n");
        /*
        : 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana
yazdırın.
         */
        for (int i=0; i<=20 ; i++){
            System.out.println(i+"  "+i*i*i);
        }
        System.out.println("\n\n---Taks 8---\n");
        //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)

        for (double c =23; c<=50; c++){
            double f=c*1.8+32;
            System.out.println("c : "+c+" iken f : "+f);
            /*veya
            System.out.println(c*1.8+32);*/
        }
        System.out.println("\n\n---Taks 9---\n");
        // a dan z ye kadar olan harfleri ekrana yazdırın.
        for (char ch ='a'; ch<='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println("\n\n---Taks 9b---\n");
        for (char ch ='A'; ch<='Z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println("\n\n---Taks 10---\n");
        // 9 sayısının çarpım tablosunu yazdırınız
        System.out.println("9'un Çarpım Tablosu");
        for (int i=0; i<=10; i++){
            System.out.println("9 * "+i+" = "+(9*i));
        }
    }
}
