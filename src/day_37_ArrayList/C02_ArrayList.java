package day_37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {
        //import java.util.ArrayList; ile import edilir
        //import java.util.*; yapılırsa tüm sınıflar import edilir
        ArrayList<String> arrList=new ArrayList<>();
        ArrayList<Integer>inList=new ArrayList<>();

        // add() veri ekler
        arrList.add("Harun");//hem ekleme ayptı ARRAYlİSTE HEM DE add.() ile boolean yaptı
        arrList.add("Ziya");

        //size() kapasiteyi bildirir
        // System.out.println(arrList.size()); kapasitesini bize verir. var olan eleman sayısı

        // get() yazılan index no ile, indeksteki veriyi getirir
        // System.out.println(arrList.get(0); index kabul eder içine
        // mesala 0 yazsak harun, 1 yazsak ziya'yı getirir
        //eğer kağasitesinde fazla bi ibdex no girersek hatra verir

        //isEmpty() boş mu kontrol eder
        //System.out.println(arrList.isEmpty()); //boş olup omadığını kntrol


        arrList.add(0,"Mehtap");
        arrList.add(1,"Ümit");

       // clear() tüm verileri siler
        // arrList.clear(); yapılırsa hem void(yani hiçbirşey) cevirir hem de arrayListin içini temizler

        //remove() indeksi siler
        //arrList.remove(1); indeksi siler
       // System.out.println(arrList.get(1));
        System.out.println(arrList);

        //set() indeksi girilen verinin içeriğini değiştirir
        //index no verip add() ile veri atarsak onu, o indexte atayıp,o indextek ve sonrasını var oaln veriyi kaydırır
        arrList.set(1,"Emine");//set ile index no ve yeni veri yazarak veri atarsak
        // sadece o indeksteki veriyi değiştirerek atar
        System.out.println(arrList);

        //indexOff
        System.out.println(arrList.indexOf("Mahmut"));//girilen verinin hangi indexte olduğunu gösterir,
        // yoksa -1


    }
}
