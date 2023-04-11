package day_29_FullReview1;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("aaabbccdfff",'f'));

    }
    /*
    Write a method that can return the frequency of a char from a String

            Ex:
                str = "AAABBBC" ch = 'A'

            Output:
                3/
     */
    public static int frequencyOfCharacters(String str,char ch){
        int freq=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if (eachChar==ch){
                freq++;
            }

        }
        return freq;
    }
}
