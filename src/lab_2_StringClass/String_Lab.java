package lab_2_StringClass;

public class String_Lab {
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

        System.out.println("\n----Soru 5-----");
        String str4 = "Ali Babanın Çiftliği";
        System.out.println(herHarfiUcKereYaz(str4));
        //veya
        int kacdefa = 5;
        System.out.println(herHarfiIstediginKadarYaz(str4, kacdefa));

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

        System.out.println("-------Soru 8--------");
        String str7 = "Kinlenmek";
        String str8 = "ekin";
        String target = "kin";
        System.out.println(kelimekontrol(str8, target));

        System.out.println("\n-------Soru 9--------");
        String str9 = "Ahmet";
        String str10 = "Ali";
        System.out.println(cokluYazdir(str9, str10, 2, 5, 3));

        System.out.println("\n-------Soru 10--------");
        System.out.println(karakterTamamlama(str9, 5, '.'));//Ahmet
        System.out.println(karakterTamamlama(str10, 5, '.'));//Ali..

        System.out.println("\n-------Soru 11--------");
        String str11="kanka";
        System.out.println(ilkIkiHarf(str11));
        System.out.println(ilkVeSonKelimeKontrol(str11, 2));

        System.out.println("\n-------Soru 12--------");
        String isim="Ali Veli Deli Sonbuldu";
        System.out.println(sonKelimeBul(isim));

        System.out.println("\n-------Soru 13--------");
        String str5="aaaaaaa";
        System.out.println(yinelenenKelimeCikartma(str11));
        System.out.println(yinelenenKelimeCikart1(str11));
        System.out.println(yinelenenKelimeCikartma(str5));
        System.out.println(yinelenenKelimeCikart1(str5));

        System.out.println("\n-------Soru 14--------");
        String str16="Derslerime cok calisiyorum";
        System.out.println(tekrarEdenHarfler(str16));


        System.out.println("\n-------Soru 19--------");
        String str12="Nefiss";
        String str13="Ennfes";
        System.out.println(ikiKelimeAyniMi(str12, str13));

        System.out.println("\n-------Soru 25--------");

        String str14="Seni seviyorum";
        String str15="Sev seni seveni , sevmek güzeldir";
        String kontrol="sev";
        System.out.println(kelimeKacKereVar(str14, kontrol));
        System.out.println(kelimeKacKereVar(str15, kontrol));

    }

    /* Soru 1) Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
ise inputu döndüren bir metot yazınız.
Merhaba Mer
Ali Ali */
    public static String ilkUcHarfGetir(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    /* Soru 2) Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
Merhaba dünya Merhaba%dünya
     */
    public static String boslukSilYuzdeEkle(String str) {
        return str.replace(" ", "%");

    }

    /* Soru 3) Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
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

    /* Soru 4) Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
yazınız.
(Merhaba ,a, e) Merheba
(Kasaba , a, i) Kisaba
     */
    public static String ilkKelimeDegistir(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }

    /* Soru 5) Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
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

    /* Soru 6) Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
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
    /* Soru 7) Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
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
    /* Soru 8)Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
Kinlenmek true
Kin tutmak true
Ekin ektim true
Keskin ilçesinden geçiyorum false
Neden kin tutuyorsun false*/
    public static boolean kelimekontrol(String str, String target) {
        if (target == null) {
            return false;
        }//null "" girilirse patlamasın diye
        str = str.toLowerCase();
        target = target.toLowerCase();
        return str.startsWith(target) || str.substring(1).startsWith(target);
    }

    /* Soru 9)Kullanıcıdan 2 kelime alın kısa kelime yi başta 2, defa uzun kelimeyi ortada 30
 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
 Mehmet
 Ali
 AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
 hmetAliAli*/
    public static String cokluYazdir(String str1, String str2, int ilkDongu, int ortaDongu, int sonDongu) {
        String result = "";
        if (str1.length() < str2.length()) {

            for (int i = 0; i < ilkDongu; i++) {
                result += str1 + " ";
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result += str2 + " ";
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str1 + " ";
            }
        } else {
            for (int i = 0; i < ilkDongu; i++) {
                result += str2 + " ";
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result += str1 + " ";
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str2 + " ";
            }
        }
        return result;

    }

    /* Soru 10)Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
 altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
 Sabun Sabun
 Merhaba Merha
 Ali Ali..
 Hey Hey..
 Pi Pi…
     */
    public static String karakterTamamlama(String str, int kackarakteristeniyor, char karakter) {

        if (str.length() >= kackarakteristeniyor) {
            return str.substring(0, kackarakteristeniyor);
        }
        //int count = kackarakteristeniyor - str.length(); kadar
        for (int i = str.length(); i < kackarakteristeniyor; i++) {
            str += karakter;
        }
        return str;
    }
    /* Soru 11)Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
almıyorsa false yazdırın.
Ankara false
Kafka true
Salsa true
Saksı false*/
    public static boolean ilkIkiHarf (String str){
        if(str==null || str.length()<2){return false;}

        return (str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2)));

    }
    public static boolean ilkVeSonKelimeKontrol (String str,int karaktersatisi){
        if(str==null || str.length()<karaktersatisi||karaktersatisi<1){return false;}

        return (str.substring(0,karaktersatisi).equalsIgnoreCase(str.substring(str.length()-karaktersatisi)));

    }
    /* Soru 12) Kullanıcının ad ve soyad bilgilerini ekrana yazdırın
       Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
       İnput: "Harun Özsoy "
       Output: "Soy isminiz Özsoy."
       İnput:" Harun Kenan Özsoy "
       Output: "Soy isminiz Özsoy."
       İnput: "Harun Kenan Can Özsoy "
       Output: "Soy isminiz Özsoy dır."
       İnput:" Harun Kenan Can Sami Özsoy"
       Output: "Soy isminiz Özsoy dır."
       sonda başta boşluk da olsa */
    public static String soyAdBul(String str){
        str=str.trim();
        String soyad=" ";
        int index=0;
        for (int i = str.length(); i >=0 ; i--) {
            if(str.charAt(i)==' '){
                index=i;
                break;
            }
        }
        return soyad=str.substring(index);
    }
    public static String sonKelimeBul(String str){
        if(str==null){return null;}
        str=str.trim();
        return str.substring(str.lastIndexOf(" ")+1);
    }
    /*13)Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
Merhaba Merhab
Ananas Anas
     */
    public static String yinelenenKelimeCikartma(String str){
        String result ="";
        for (int i = 0; i <str.length(); i++) {
            if(!result.contains(str.substring(i,i+1))){//şayet içerde,
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }
    //veya
    public static String yinelenenKelimeCikart1(String str){
        String result="";
        for (; str.length()>0 ;) {//ne kadar döneceği
            result+=str.substring(0,1);//her döngüde kısalacak sözcüğün ilk harfini resultta atıyor
            str=str.replace(str.substring(0,1),"");//sonra o harfi,tekrarlarıyla beraber siliyor
        }
        return result;
    }
    /*Soru 14) Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
olarak return eden methot yazınız.
" Java " output:a
" Javva " output:av
" Derslerime cok calisiyorum" output:erslimco
    */
    public static String tekrarEdenHarfler(String str){
        str = str.toLowerCase();
        System.out.println(str = str.trim());
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+str.charAt(i);
            if (!result.contains(ch)){//contains charAt kontrolu yapamadığı için
                result+=ch;
            }
        }
        return result;
    }
    /* Soru 19) Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
            yazdırın. (anagram kelime ise)
    İftar – Tarif true
    Zehra – Ezhar true
    Nefes – Enfes true
    Selcuk-Elyase false*/

    public static boolean ikiKelimeAyniMi(String str1, String str2){
        str1= str1.toLowerCase();//nefess
        str2= str2.toLowerCase();//ennfes
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i <str1.length() ; i++) {
            int index= str2.indexOf(str1.charAt(i));
            if (index==-1){return false;}
            str2=str2.substring(0,index)+str2.substring(index+1);
        }
        return true;
    }
    /*Soru 25)
    Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
ekrana yazdırın.
Seni seviyorum 1
Sevmek veya sevmemek 2
Sev seni seveni , sevmek güzeldir. 3
     */
    public static int kelimeKacKereVar(String str, String kelime){
        str=str.toLowerCase();
        kelime=kelime.toLowerCase();
        int frequency=0;
        while (str.contains(kelime)){
            str= str.replaceFirst(kelime,"");
            frequency++;
        }
        return frequency;
    }
}
