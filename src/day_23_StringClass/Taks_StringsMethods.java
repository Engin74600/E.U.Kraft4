package day_23_StringClass;

import java.util.Scanner;

public class Taks_StringsMethods {
    public static void main(String[] args) {
        /*
Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
olana hepsini birleştirin. Concat() kullanın. (Ödev)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir mesaj girin!");
        String mesaj= sc.nextLine();
        System.out.println("Mesaj = " + mesaj);


        System.out.println("-----Task 1-----\n");
        //Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin.
        //lengthMesaj(mesaj);

        System.out.println("\n-----Task 2-----\n");
        //Adınızın ve soyadınızın kaç karakterden oluştuğunu konsola yazdırın.
        String nameSurname = "Engin Ulus";
        System.out.println("Ad Soyad = " + nameSurname);
        System.out.println("Adınız " + (nameSurname.length()-1)+" karakterdir.");

        System.out.println("\n-----Task 3-----\n");
        //Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın.
        System.out.println(nameSurname.toUpperCase());

        System.out.println("\n-----Task 4-----\n");
        //Aldığınız mesajın her karakterini konsola alt alta yazdırın.
        //charMesaj(mesaj);

        System.out.println("\n-----Task 5-----\n");
        //Aldığınız mesajın son index ini yazdırın.
        System.out.println("karakter sayısı: "+mesaj.length());
        System.out.println("Son karakter " +mesaj.charAt(mesaj.length() - 1));
        System.out.println("mesaj son indexi : "+ mesaj.indexOf(mesaj.charAt(mesaj.length()-1)));
        //"Ali Baba" gibi girilen bir mesajda tekrar eden a'lardan dolayı hata veriyor sanırım

        System.out.println("\n-----Task 6-----\n");
        /*Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
        olana hepsini birleştirin. Concat() kullanın. */
        System.out.println("Lütfen sırasıyla üç kelime girin");
        String str1= sc.nextLine();
        System.out.println("1. kelime "+str1);
        String str2 = sc.nextLine();
        System.out.println("2. kelime "+str2);
        String str3= sc.nextLine();
        System.out.println("3. kelime "+str3);
        concatWord(str1,str2,str3);




    }

    /**
     * a method that prints the escaped character of the entered message
     */
    public static void lengthMesaj(String str){

        System.out.println("Girilen mesaj " + str.length()+" karakterdir.");
    }

    /**
     * A method that prints the characters of the entered message one after the other
     * @param str
     */
    public static void charMesaj(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    /**
     * girilen 3 kelimeyi büyükten küçüğe birleştiren bir method
     * @param a
     * @param b
     * @param c
     */
    public static void concatWord(String a,String b,String c){
        int x=a.length();
        int y=b.length();
        int z=c.length();
        if (x>=y&&y>=z){
            System.out.println(a.concat(b+c));
        }else if (y>=z&&z>=x){
            System.out.println(b.concat(c+a));
        }else if(z>=x&&x>=y){
            System.out.println(c.concat(a+b));
        }

    }
}
