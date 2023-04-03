package day_24_StringClass_Con;

public class C02_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        String s2 = "MERHaba";

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

    }
}
