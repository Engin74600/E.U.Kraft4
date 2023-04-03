package day_24_StringClass_Con;

public class C07_ReverseString {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String reserved="";

        for (int i = str.length()-1; 0<=i ; i--) {
            reserved+=str.charAt(i);//stringe char atayamayız ama charla concat yapabilişriz
            // boş olduğu için de sıkıntı olmaz

        }
        System.out.println(str);
        System.out.println(reserved);
    }
}
