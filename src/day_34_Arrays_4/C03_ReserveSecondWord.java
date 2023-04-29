package day_34_Arrays_4;

public class C03_ReserveSecondWord {
    public static void main(String[] args) {
        System.out.println(reserveSecondWord("I Love Java"));
    }
    /*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */
    public static String reserveSecondWord(String str){
        String result="";
        String reserve="";
        String[] words = str.split(" ");
        for (int i = words[1].length()-1; 0<=i ; i--) {
            reserve+=words[1].charAt(i);
        }
        words[1]=reserve;

        for (String word:words) {
            result+=word+" ";
        }
        return result;
    }
}
