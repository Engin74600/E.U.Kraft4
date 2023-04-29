package day_36_Wrapper;

import java.util.Random;

public class C03_WropperClass_Characters {
    public static void main(String[] args) {
        //Character.isLetter() harf olup olmadığını kontrol eder(daha kapsamlı)
        //Character.isDigit() rakam/sayı olup olmadığı kontrol eder
        //Character.isAlphabetic() harf olup olmadığını kontrol eder
        System.out.println(Character.isAlphabetic('A'));//t
        System.out.println(Character.isAlphabetic('*'));//f
        System.out.println(Character.isAlphabetic('/'));//f
        System.out.println(Character.isAlphabetic('ş'));//t
        System.out.println(Character.isAlphabetic('^'));//f
        System.out.println(Character.isLetterOrDigit('9'));//t sadece harf veya sayı
        System.out.println(Character.isLetterOrDigit('-'));//f sadece harf veya sayı


        String s= "merhaba 3 nasılsın 10, neler23,yapıyorsun?";
        System.out.println(stringinSayilariniTopla(s));

        /*
    //stringin içindeki kelimeyi bul
    "!'^^+j+%&/a/&())v/&%a&/()"
     */
        String str="!'^^+j+%&/a/&())v/&%a&/()";
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);

        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+l%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        //içindeki gömülü cümleyi bulun
       /* String result2="";
        for (int i = 0; i <str2.length() ; i++) {
            if(Character.isLetter(str2.charAt(i))||str2.charAt(i)==' '){
                result2+=str2.charAt(i);
            }

        }
        System.out.println(result2);*/
        String str3 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+l%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        String harf="";
        String sayi="";
        String karakter="";
        for (int i = 0; i <str3.length() ; i++) {
            if(Character.isLetter(str3.charAt(i))){
                harf+=str3.charAt(i);
            } else if (Character.isDigit(str3.charAt(i))) {
                sayi+=str3.charAt(i);
            }else {
                karakter+=str3.charAt(i);}

        }
        System.out.println("harf = " + harf);
        System.out.println("sayi = " + sayi);
        System.out.println("karakter = " + karakter);

    }
    /*
    //stringin içindeki kelimeyi bul
    "!'^^+j+%&/a/&())v/&%a&/()"
     */

    /*
    "merhaba 3 nasılsın 10, neler23,yapıyorsun?"
    sayıların toplamı
     */
    public static int stringinSayilariniTopla(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sum+=Integer.valueOf(s.charAt(i));
            }

        }
        return sum;
    }


}
