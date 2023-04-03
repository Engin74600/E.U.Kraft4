package day_23_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str = "Hello";//literal way-Heap memory-String Pool
        String str1 = "Hello";//string Pooldaki hello işaretlendi
        String str3 = "hello";//literal-heap memory-String pool_bUyuk kucuk harfe duyarlı

        String str4 = new String ("Hello");//String object-heap memory
        boolean bl; //local değişken-initilize edilmediği için yazdırmada hata verir
        bl = str1==str; //String pooldaki aynı değişkene referans oldukları için true oalcak
        System.out.println(bl);
        bl=str.equals(str1); //true

        System.out.println("----------------------");
        bl= str==str3;// false verir aynı string pooldaki objeye işaretli değil
        System.out.println(bl);
        bl=str.equals(str3); //false
        System.out.println(bl);
        System.out.println("--------------------------");
        bl = str == str4; // false..aynı objeye referans değil. içerik kontrol de etmişyor
        bl = str.equals(str4);//true çünkü string objeck içeriklerini kıyazlıyor


    }


}
