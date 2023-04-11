package day_27_String_Lab2;

public class StringLab2 {
    public static void main(String[] args) {
        System.out.println("-------Soru 8--------");
        String str1 = "Kinlenmek";
        String str = "ekin";
        String target = "kin";
        System.out.println(kelimekontrol(str, target));

        System.out.println("\n-------Soru 9--------");
        String str2 = "Ahmet";
        String str3 = "Ali";
        System.out.println(cokluYazdir(str2, str3, 2, 5, 3));

        System.out.println("\n-------Soru 10--------");
        System.out.println(karakteretamamlama(str2, 5, '.'));//Ahmet
        System.out.println(karakteretamamlama(str3, 5, '.'));//Ali..

        String str4="kanka";
        System.out.println(ilkIkiHarf(str4));
        System.out.println(ilkVeSonKelimeKontrol(str4, 2));

        System.out.println("\n-------Soru 11--------");
        String isim="Ali Veli Deli Sonbuldu";
        System.out.println(sonKelimeBul(isim));

        System.out.println("\n-------Soru 12--------");
        String str5="aaaaaaa";
        System.out.println(yinelenenKelimeCikartma(str4));
        System.out.println(yinelenenKelimeCikart1(str4));
        System.out.println(yinelenenKelimeCikartma(str5));
        System.out.println(yinelenenKelimeCikart1(str5));

    }

    /*8)Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
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

    /*9)Kullanıcıdan 2 kelime alın kısa kelime yi başta 2, defa uzun kelimeyi ortada 30
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

    /*10)Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
 altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
 Sabun Sabun
 Merhaba Merha
 Ali Ali..
 Hey Hey..
 Pi Pi…
     */
    public static String karakteretamamlama(String str, int kackarakteristeniyor, char karakter) {

        if (str.length() >= kackarakteristeniyor) {
            return str.substring(0, kackarakteristeniyor);
        }
        //int count = kackarakteristeniyor - str.length(); kadar
        for (int i = str.length(); i < kackarakteristeniyor; i++) {
            str += karakter;
        }
        return str;
    }
    /*10)Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
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
    /*11)
    Kullanıcının ad ve soyad bilgilerini ekrana yazdırın
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
    /*12)Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
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

}
