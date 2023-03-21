package day_14_NestedWileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        System.out.println("\n----Örnek 1----\n");
        /*
        111111
        111111
        111111
        111111
        111111
        111111
        */
        for ( int i =1; i<=6;i++){//dış döngü satır sayısı döngüsü için
            for (int j =1 ; j<=6; j++){//iç döngü
                // HER satırdaki 1 DÖNGÜSÜ İÇİN
                System.out.print(1);
            }
            System.out.println();//dış döngünün alt satırda devamı için
        }
        System.out.println("\n----Örnek 2------\n");
        /*
        123456
        123456
        123456
        123456
        123456
        123456*/
        for ( int i =1; i<=6;i++){//dış döngü satır sayısı döngüsü için
            for (int j =1 ; j<=6; j++){//iç döngü
                // HER satırdaki 1 DÖNGÜSÜ İÇİN
                System.out.print(j);//her satırdaki sayının artısşı için
            }
            System.out.println();//dış döngünün alt satırda devamı için
        }
        System.out.println("\n----Örnek 3------\n");
        /*
         *
         **
         ***
         ****
         *****
         ******
         */
        for ( int i =1; i<=6;i++){
            for (int j =1 ; j<=i;j++){//i yazıldı, çünkü her seferinde artmasını
                //istiyoruz. her seferinde artan bir i var. onu yazdık
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n----Örnek 3------\n");
        /*
         ******
         *****
         ****
         ***
         **
         *
         */
        for ( int i =6; 0<=i;i--){//satır sayısınının sınırını
            // azalacak sayı ile belirledik ki
            // bu azalmayı satırdaki yıldızın azalmasında kullanacaz
            for (int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
