package day_24_StringClass_Con;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        //indecOf() ilk bulunanın indexsini getirir
        //lastIndexOf() son bulunanın indeksini getirir
        //            1234567
        String str = "Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("--------------\n");
        int length=str.length();
        System.out.println(length);
        str=str.replace("a","");//Merhb 5
        int lengthFinal=str.length();// 5
        System.out.println();


    }
}
