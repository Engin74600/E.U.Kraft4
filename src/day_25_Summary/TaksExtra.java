package day_25_Summary;

public class TaksExtra {
    public static void main(String[] args) {
        String name ="Engin";
        String surname="Ulus";
        System.out.println(ortaUcHarf(name)); //1+
        System.out.println(kesBirlestir(name, surname));//2+

        String name1 ="Aysun";
        String surname1="Atay";
        System.out.println(arindirma(name1, surname1));//3
        System.out.println(ilkucharfleribirlestir(name1, surname1));//4+
        System.out.println(birlestir(name1, surname1));//5+
        System.out.println(tersyazdir(name1 + surname1));//6+
        System.out.println(tersyazdir(surname));//6+
                                                //7
        String bayramsj = "Hayırlı bayramlar sevgiyle kalın canlar!";
        System.out.println(iltifat(bayramsj));//8+
        sonUcHarfUckez(name);//9+

    }
    /*
    1-İsminizin ortadaki 3 harfini veren bir method yazın.*/
    public static String ortaUcHarf(String str){
        return str.substring(1,4);
    }

    /*2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
birleştirin.*/
    public static String kesBirlestir(String str1,String str2){
        if(str1.length()<str2.length()){
           str2=str2.substring(0,str1.length());
           //baştan uzun olan str2 kadar kısaltıp onunla nitleştirdik

        } else if (str2.length()<str1.length()){
            str1=str1.substring(0,str2.length());}
        return str1.concat(str2);
    }

    /*3-İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
baş harfinden arındırıp yazdıran bir method oluşturun.*/
    public static String arindirma(String name,String surname){
        if(surname.contains(name.substring(0,1))){
            return surname.replace(name.substring(0,1),"");
        }
        return "isminizin ilk harfi soyisminizde bulunmuyor";
    }

    /*4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
oluşturan bir method yazın.*/
    public static String ilkucharfleribirlestir(String name,String surname){
        String nickname;
        return nickname=name.substring(0,4).concat(surname.substring(0,4));
    }

    /*5-Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna
ekleyen bir method yazın.*/
    public static String birlestir(String str1,String str2){
        String concat1;
        String concat2;
        if(str1.length()<str2.length()){
            concat1=str1.concat(str2);
            concat2=concat1.concat(str1);
        }else{
            concat1=str2.concat(str1);
            concat2=concat1.concat(str2);
        }
        return concat2;
    }

    /*6-Girilen kelimeyi tersten yazdıran bir method yazın.*/
    public static String tersyazdir(String str) {
        String reserved = "";

        for (int i = str.length() - 1; 0 <= i; i--) {
            reserved += str.charAt(i);//stringe char atayamayız ama charla concat yapabilişriz
            // boş olduğu için de sıkıntı olmaz

        }
        return reserved;
    }

    /*7-Dün akşam eve giderken onları görmüştüm. Cümlesindeki ü
harfinin önünde ve arkasında olan harflerden bir string üreten
bir method yazın.*/
    public static String cokKarisikMethod(String str){
        for (int i = 0; i < str.length()-1; i++) {
            str.charAt(i);
           // if(str.charAt(i)==str.contains("ü")){


        }
        return str;
    }
    /*8) Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
isteyin cümle içinde sev köküne sahip bir kelime var ise bir
method what a lovely person(ne hoş bir insan) mesajı
döndürsün.
     */
    public static String iltifat(String msj){
        String iltifat="";
        if(msj.contains("sev")){
            iltifat="What a lovely person";
        }
        return iltifat;
    }

    /*İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.*/
    public static String sonUcHarfUckez(String name){
        for (int i = 0; i <3 ; i++) {
            System.out.println(name.substring(name.length() - 3, name.length()));
        }
        return name;
    }
}
