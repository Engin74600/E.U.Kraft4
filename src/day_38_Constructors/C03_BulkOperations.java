package day_38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(10);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,33,3,3,2,2,1,0));
        //addAll() method colletion tip gerektirir. şayet elimizte atamaya hazır bir elemanlar varsa
        //Arrays sınıfındaki asList methodu onu collection yapar, addAll ilde hepsi atanır
        System.out.println(list2);
        System.out.println("-------------------------");
        //yine bir Arraylist'ten başka bir arraylisti karşılaştırıp ayıklama yapmak yerine
        //Arrays.asList() ile içine yazdıklarını removeAll() ile ayıklayabiliriz
        list2.removeAll(Arrays.asList(1,2,3,0));
        System.out.println(list2);
        System.out.println("--------------------------");
        list2.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,33,3,3,2,2,1,0));
        list2.retainAll(Arrays.asList(1,2,3,0));
        System.out.println(list2);//öncekinde ayıklanıp atılacaklardı
        //bunda nelerin atılmayacağını listeliyoruz

        ArrayList<String>jobTitles= new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","Full Stack Automantiom","Java Developer","SDET",
                "Software Davelopment Engineer In Test","Test Engineer","Quality Assuarance Engineer",
                "QA Automation Engineer"));
        System.out.println(jobTitles);


    }
}
