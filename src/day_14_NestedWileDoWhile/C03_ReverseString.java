package day_14_NestedWileDoWhile;

public class C03_ReverseString {
    public static void main(String[] args) {
       /* String name = "Ali";
        // harf sırası 012
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));*/
        String str ="teneke";
        //           012345
        /*System.out.println("str.length = "+str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));

        for (int i = 0; i<str.length();i++) {
            System.out.print(str.charAt(i));
        }*/
        // Stringi ters çevirme
        String reverse ="";
        System.out.println("str length = "+str.length());

        for (int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i));
        }
            reverse += str.charAt(5);
            reverse += str.charAt(4);
            reverse += str.charAt(3);
            reverse += str.charAt(2);
            reverse += str.charAt(1);
            reverse += str.charAt(0);
            System.out.println("\n"+reverse);
            reverse = "";


            for (int i = str.length() - 1; 0 <= i; i--){
                reverse+=str.charAt(i);}
            System.out.println(reverse);


    }
}
