package day_33_Arrays_3;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {
//// In a char[] write all of the alphabet in reversed order
        char[] alphabet;
        alphabet = new char[26];
        char ch ='Z';
        for (int i = 0; i < alphabet.length ; i++) {
            alphabet[i]=ch;
            ch--;
        }
        C04_Arrays_Methods.arrayYazdir(alphabet);
        System.out.println(Arrays.toString(alphabet));
        ch = 'A';
        for (int i = 0; i < alphabet.length ; i++,ch++) {
            alphabet[i]=ch;
        }
        C04_Arrays_Methods.arrayYazdir(alphabet);
        System.out.println(Arrays.toString(alphabet));
    }
}
