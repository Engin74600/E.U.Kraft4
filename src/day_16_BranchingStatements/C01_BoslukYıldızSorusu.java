package day_16_BranchingStatements;

public class C01_BoslukYıldızSorusu {
    public static void main(String[] args) {
        int taban =0;
        int kuvvet =0;
        int result =1;
        if (taban==0&&kuvvet==0){
            result=0;
        }
        for (int i = 0; i <kuvvet ; i++) {
            result*=taban;
        }
        System.out.println(result);
        System.out.println("------------");
        //piramit
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *

        for (int i = 5; i >0; i--) {//satır sayısı döngüsü
            for (int j = 0; j < i ; j++) {//b0şluk döngüsü
                System.out.print(" ");
            }
            for (int k = 6-i; k >0 ; k--) {//yıldız föngüsü
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
