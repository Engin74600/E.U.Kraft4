package day_24_StringClass_Con;

public class C05_SubString {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        //            0123456789012345678901234
        // method 2 şekilde kullanılır
        //1. tek parametli. girilen parametredeki indeksten sonuna kadar kısmı alır
        System.out.println(str.substring(5)); //Programing Language
        System.out.println(str.substring(0));// hepsi yazılacak
        System.out.println(str.substring(17));//Language
        System.out.println(str.substring(str.length()));//emptyIndex; Hiçlık
        System.out.println(str.substring(str.length()-8));//language
        System.out.println(str.substring(str.length()-3));//age

        // 2. olarak 2 parametli olarak. ilk parametre indeksinden son paremetre hariç
        System.out.println(str.substring(2, 4));//va
        System.out.println(str.substring(5, 16));//Programming
        System.out.println(str.substring(0, 1));//J
        System.out.println(str.substring(str.length()-1,str.length()));//e
        System.out.println(str.substring(5, 5));//hiçlik
        System.out.println(str.substring(4, 5));//boşluk
        //System.out.println(str.substring(5, 3));runtine eror: hata verir


    }
}
