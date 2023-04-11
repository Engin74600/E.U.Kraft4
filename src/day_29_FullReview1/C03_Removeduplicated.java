package day_29_FullReview1;

public class C03_Removeduplicated {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabbccff"));
    }
    /*
    /Write a method that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC
                Output:
                    ABC
            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding/
     */
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+str.charAt(i);
            if (!result.contains(ch)){//contains charAt kontrolu yapamadığı için
                result+=ch;
            }
        }
        return result;
    }

}
