package day_26_String_Lab;

public class String_Lab1 {
    public static void main(String[] args) {
        System.out.println("----Soru 1-----");
        String str = "Harun";
        System.out.println(ilkUcHarfGetir(str));

        System.out.println("\n----Soru 2-----");
        String str1 = "Harun Ali veli";
        System.out.println(boslukSilYuzdeEkle(str1));

        System.out.println("\n----Soru 3-----");
        String str2 = "Sanayağı";
        System.out.println(ikinciyari(str2));
        System.out.println(ikinciyari2(str2));

        System.out.println("\n----Soru 4-----");
        String str3 = "Olmamış";
        String eski = "O";
        String yeni = "A";
        System.out.println(ilkKelimeDegistir(str3, eski, yeni));

        System.out.println("\n----Ödev-----");
        String str4 = "Ali Babanın Çiftliği";
        System.out.println(terim(str4));

        System.out.println("\n----Soru 5-----");
        System.out.println(herHarfiUcKereYaz(str4));
        //veya
        int kacdefa = 5;
        System.out.println(herHarfiIstediginKadarYaz(str4, kacdefa));

        System.out.println("\n----Ekstra-----");
        String str5="Kaybolmamışlar";
        System.out.println(subString(str5, 4));

        System.out.println("\n----Ekstra2-----");
        System.out.println(subString(str5, 4,8));

        System.out.println("\n----Soru 6-----");
        String str6="Alamamışsa";
        //büyük küçük harf gözetir
        System.out.println(karakterSay(str6, 'a'));//3
        //büyük küçük harf gözetmez farklı çözümler
        System.out.println(karakterSay2(str6, "a"));
        System.out.println(buyukKucukGozetmedenKarakterSay(str6, 'a'));//4
        System.out.println(buyukKucukGozetmedenKarakterSay2(str6,"a"));//4

        System.out.println("\n----Soru 7-----");
        //string değerli
        System.out.println(harfSil(str6, "A"));
        //char değerli
        System.out.println(harfSilchar(str6, 'A'));
        //farklı bi çözüm
        System.out.println(harfSil2(str6, 'a'));

    }

    /* 1)Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
ise inputu döndüren bir metot yazınız.
Merhaba Mer
Ali Ali */
    public static String ilkUcHarfGetir(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    /*2) Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
Merhaba dünya Merhaba%dünya
     */
    public static String boslukSilYuzdeEkle(String str) {
        return str.replace(" ", "%");

    }

    /*3) Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
yazdırın.
Sanayagı yagı
Mutluluk uluk
     */
    public static String ikinciyari(String str) {
        return str.substring(str.length() / 2);
    }

    //veya
    public static String ikinciyari2(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2);

        } else {
            return str.substring(str.length() / 2 + 1);//kelime 2ye bölünmüyor.bi sonraki harften başlatmak için
            //1le topladık. ama 1le toplamadan üste yuvarlıyacaksak,
            //return str.substring((int)Math.ceil((double)str.length()/2);
            //                      |     |          önce double yaptık 4,5 oldu
            //                      |   sonra math ceil ile bi üste yuvrladık 5,0
            //                      sonra 5,0'ı 5 yapmak için int..
        }
    }

    /* 4) Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
yazınız.
(Merhaba ,a, e) Merheba
(Kasaba , a, i) Kisaba
     */
    public static String ilkKelimeDegistir(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }

    /* ödev) Pazartesiye kadar ödev: trim(String str) şeklinde bir metot yazın
    trim gibi çalışsın  ve string döndürsün.
    İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
     */
    public static String terim(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        return str.substring(start, end + 1);
    }

    /*5)Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
Merhaba MMMeeerrrhhhaaabbbaaa
Ali AAAllliii*/
    public static String herHarfiUcKereYaz(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //veya daha genel olarak
    public static String herHarfiIstediginKadarYaz(String str, int kez) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {//harfleri tek tek abelirleme
            for (int j = 0; j <= kez; j++) {//yazdırma döngüsü
                result += str.charAt(i);
            }

        }
        return result;
    }

    /* Ekstra) tek index numarası alan substring methodunu yazınız
    "Merhaba" str.substring(3)=haba
    subString (String str;int index)
     */
    public static String subString(String str, int index) {
        String result="";
        for (int i = index; i < str.length(); i++) {
            result+=str.charAt(i);
        }
        return result;
    }
    /* Ekstra2) çift index numarası alan substring methodunu yazınız
    "Merhaba" str.substring(3)=haba
    subString (String str;int index)
     */
    public static String subString(String str, int startindex,int endindex) {
        String result="";
        for (int i = startindex; i < endindex; i++) {
            result+=str.charAt(i);
        }
        return result;
    }

    /*6) Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
edilecek)
Ankara,a 3
Edirne,e 2
     */
    //büyük kücük gözetir
    public static int karakterSay(String str,char ch){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    //farklı bir çözüm daha
    public static int karakterSay2(String str,String str1){
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        int stratLength=str.length();
        int finalLength=str.replace(str1,"").length();
        return stratLength-finalLength;
    }
    //büyük küçük harf gözetmeyen charlı çözüm
    public static int buyukKucukGozetmedenKarakterSay(String str,char ch){
        String x=ch+"";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
            }
        }
        return count;
    }
    //buyuk kucuk gözetmeden stringli çözüm
    public static int buyukKucukGozetmedenKarakterSay2(String str,String str2){
        str=str.toLowerCase();
        str2=str2.toLowerCase();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equals(str2)){
                count++;
            }
        }
        return count;
    }
    /*Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
kaldırılmış şekilde string döndüren programı yazınız.
(Merhaba, a) Merhb*/
    public static String harfSil(String str,String harf){
        str=str.toLowerCase();
        harf=harf.toLowerCase();
        return str.replace(harf,"");
    }
    public static String harfSilchar(String str,char harf){
        str=str.toLowerCase();
        String harf2=(harf+"").toLowerCase();
        return str.replace(harf2,"");
    }
    public static String harfSil2(String str,char harf){
        str=str.toLowerCase();
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=harf){
                result+=str.charAt(i);
            }
        }
        return result;
    }


}
