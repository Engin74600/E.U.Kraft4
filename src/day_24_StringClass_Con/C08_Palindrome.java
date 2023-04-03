package day_24_StringClass_Con;

public class C08_Palindrome {
    public static void main(String[] args) {
        String word="civic";
        //           01234
        String reserve="";
        for (int i = word.length()-1;  0<=i ; i--) {
            reserve=reserve.concat(word.substring(i,i+1));

        }
        //System.out.println(reserve);
        boolean isPalindrome=reserve.equals(word);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
