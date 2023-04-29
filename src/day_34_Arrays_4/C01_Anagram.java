package day_34_Arrays_4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("iki kelime girin");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println(str1+" ile "+str2+" anagramdır");
        } else {
            System.out.println(str1 + " ile " + str2 + " anagram değildir");
        }

    }
    // write a method that can check if str1 & str2 are build out same characters ANAGRAM
//kil  ilk
// adam dama
    public static boolean isAnagram(String str1,String str2){
        char[] chArr1 = str1.toCharArray();//charlara döndürdük
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);//charları sıraladık
        Arrays.sort(chArr2);
        return Arrays.equals(chArr1,chArr2);//sıralı charları kıyasladık
    }
}
