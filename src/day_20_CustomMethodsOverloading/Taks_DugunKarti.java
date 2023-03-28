package day_20_CustomMethodsOverloading;

import java.util.Scanner;

public class Taks_DugunKarti {
    public static void main(String[] args) {
        invitationCard();
    }
    /**
     * A method that prepares an invitation card from 2 different words entered by the user
     */
    public static void invitationCard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Düğün kartı için sırasıyla 2 kelime girin");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        if(str1.equals(str2)){
            wordControl();
        }else {
            starCard(str1,str2);
        }
    }
    /**
     * A method that prints 2 different words entered by the user with a star frame
     * @param str1
     * @param str2
     */
    public static void starCard(String str1,String str2){
        for (int i = 0; i <=(str2.length()+str1.length()+6) ; i++) {
            System.out.print("*");
        }
        System.out.println("\n* "+str1+" * "+str2+" *");
        for (int i = 0; i <=(str2.length()+str1.length()+6) ; i++) {
            System.out.print("*");
        }
    }
    /**
     *a method that warns the user under the right conditions and allows them to re-enter
     */
    public static void wordControl(){
        System.out.println("Bu kelimeler aynı! Lütfen farklı iki kekime girin!");
        invitationCard();

    }
}
