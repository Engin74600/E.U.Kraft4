package day_30_FullReview2;

public class C01_DigitsLettersSpecialChars {
    public static void main(String[] args) {

        sperateCharacters("ADGkgnfrudxh54838+%&(8Ahsdgdu=)(/&193746ldjdhj");
    }


    /*
    /*Create a method that takes a String and returns 3 different String of Letters, digits and special chars
    of that string. space is not considered as a special char
    input :
    (ABCDEExyz<x122334) (!'+%&//()
    digits = 12345
    Latters =ABCDezxcjj
    specialsChars =(!^'^%%&&)
     */

    public static void sperateCharacters(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//each charv of str
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }
            }

        }
        System.out.println("Letters : "+letters);
        System.out.println("Digits : "+digits);
        System.out.println("specialChars : "+specialChars);
    }

}
