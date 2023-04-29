package day_33_Arrays_3;

import day_32_Arrays_2.C04_Arrays_Methods;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class C03_ArrayMethods {
    public static void main(String[] args) {

        //split()
        String str="Merhaba Güzel İnsanlar";

        String[] strArr= str.split(" ");//bölme referansını boşluk olarak
        System.out.println(Arrays.toString(strArr));
        System.out.println("strArr.length = " + strArr.length);
        System.out.println("--------------");
        System.out.println(strArr[1]);
        System.out.println("------------");
        for (String s: strArr) {
            System.out.println(s);
        }
        System.out.println("----------------");
        String[] strArr2= str.split("");//bölme referansı her bir unsurun aralığı
        System.out.println("strArr2.length = " + strArr2.length);
        System.out.println(Arrays.toString(strArr2));
        System.out.println("yukarıdaki her bir hafr birer stirng");
        Arrays.sort(strArr2);
        C04_Arrays_Methods.arrayYazdir(strArr2);
        System.out.println("------------");
        // toCharArray()
        char[] charArr=str.toCharArray();
        String[] strArr3= str.split("",6);//bölme referansı ve hangi index öncesine kadar bölecekse
        System.out.println(Arrays.toString(strArr3));
        C04_Arrays_Methods.arrayYazdir(charArr);
        System.out.println("yukarıdakilern ise birer char");
        Arrays.sort(strArr3);
        C04_Arrays_Methods.arrayYazdir(charArr);
        System.out.println("----------");

        // copyOfRange()
        String[] students ={"yunus","ali","veli","deli","veysi","şeysi"};
        //                     0      1     2       3      4
        String[] ourFrends= Arrays.copyOfRange(students,2,5);//girilen indeks aralığını,son hariç,alır.
        C04_Arrays_Methods.arrayYazdir(ourFrends);
        System.out.println("--------------");
        String[] newClassMember=Arrays.copyOf(students,2);// girilen indeksin öncesine kadar alır
        C04_Arrays_Methods.arrayYazdir(newClassMember);
        System.out.println("--------------");
        //Short()
        Random random=new Random();
        int number[]=new int[10];
        for (int i = 0; i <number.length ; i++) {
            number[i]= random.nextInt(100);
        }
        C04_Arrays_Methods.arrayYazdir(number);
        Arrays.sort(number);
        C04_Arrays_Methods.arrayYazdir(number);
        System.out.println("-------------");


        //fill()
        int[] num=new int[4];
        num[0]=5;
        num[1]=4;
        num[2]=2;
        num[3]=1;
        Arrays.fill(num,2,4,7);
        C04_Arrays_Methods.arrayYazdir(num);
        Arrays.fill(num,9);
        C04_Arrays_Methods.arrayYazdir(num);


    }
}
