package day_34_Arrays_4;

import day_32_Arrays_2.C04_Arrays_Methods;

public class C02_ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Today is a perfect day to learn Java"));

    }
    /*
 Write a method that can reverse a sentence
 Ex:
 sentence = "Today is a perfect day to learn Java";

 output:
 Java learn to day perfect a is Today
 */
    public static String reverseSentence(String str){
        String reserved="";
        String[] words=str.split(" ");
       // C04_Arrays_Methods.arrayYazdir(words);
        for (int i = words.length-1; i >=0 ; i--) {
            reserved+=words[i]+" ";
        }
        return reserved;
    }
}
