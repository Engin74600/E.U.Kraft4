package day_24_StringClass_Con;

public class C09_UniqueCharacters {
    public static void main(String[] args) {
        String str ="aaabccd";
        String result = "";//bd
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);// ilk a gelecek
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println("result = " + result);


    }
}
