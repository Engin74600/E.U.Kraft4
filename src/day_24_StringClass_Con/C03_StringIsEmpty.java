package day_24_StringClass_Con;

public class C03_StringIsEmpty {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        String s2= "";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        String s3=" ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
    }
}
