package day_13_ForLoops;

import java.util.Scanner;

public class C07_ParolayıTahminEt {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String parola = "safak";
        int thakki=3;
        System.out.println("Parolayı Tahmin et!\n\t3 hakkın var.");

        for (int i=1; i<=3; i++){
            String tahmin = SC.nextLine();
            if (parola.equals(tahmin)){//String ifadenin//
                //eşitlik kontrolu
                System.out.println("Harika! buldun");
                break;
            }else {
                System.out.println("Yanlış Tahmin\n\t"+
                        (thakki-i)+" hakkın kaldı");
            }
        }



    }
}
