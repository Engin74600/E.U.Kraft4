package day_25_Summary;

public class StringExample {
    public static void main(String[] args) {
        String cumle ="Merhaba deliler";
        //             012345678901234 indeks sayısı
        //             123456789123456 cümlede harf sayıs
        System.out.println("uzunluk(cumle) = " + uzunluk(cumle));
        System.out.println("harfKucult(cumle) = " + harfKucult(cumle));
        System.out.println("harfBuyut(cumle) = " + harfBuyut(cumle));

        String kelime = "Hoşçakalın";
        //               0123456891
        System.out.println(karaktergetir(kelime, 5));
        System.out.println(birlestir(cumle, kelime));
        System.out.println(iceriyorMu(kelime, "çakal"));
        String kelime2 = "    hacı!   ";
        System.out.println(bosluklarisil(kelime2));

        System.out.println(kelimeDegistir("geldiniz", kelime, "çakalın"));
        kelimeDegistirilk("i","aba","a");
    }
    //lenght()
    public static int uzunluk(String str){
        return  str.length();
    }
    //toLowerCase()
    public static String harfKucult(String str){
       return str.toLowerCase();
    }
    //toUpperCase()
    public static String harfBuyut(String str){
        return str.toUpperCase();
    }
    //charAt()
    public static char karaktergetir(String str,int index){
        return str.charAt(index);
    }
    //concat
    public static String birlestir(String a,String b){
        return a.concat(b);

    }
    //contains()
    public static boolean iceriyorMu (String str,String kontrolEdilecekKelime){
        return str.contains(kontrolEdilecekKelime);
    }
    public static boolean iceriyorMu2(String str,String kontroledilecekKelime){
        if(str.indexOf(kontroledilecekKelime)==-1){
            return false;
        }
        return true;
    }
    //trim() Sill
    public static String bosluklarisil(String str){
        return str.trim();
    }
    //replace benim verdiğim değerle değiştir
    public static String kelimeDegistir(String str,String eskiKelime,String yeniKelime){
        return str.replaceFirst(eskiKelime,yeniKelime);
    }
    //replaceFist() ilk gördüğü yeri değiştir çık
    public static String kelimeDegistirilk(String str,String eskiKelime,String yeniKelime) {
        return str.replace(eskiKelime, yeniKelime);
    }
    //indexOf();
    //girilen değişken içinde yoksa -1 verir
    public static int ilkIndexNoGetir(String str, String kelime){
        return str.indexOf(kelime);
    }
    //method overloding yaptık
    public static int ilkIndexNoGetir(String str, char kelime){
        return str.indexOf(kelime);
    }
    //lastIndexOf()
    public static int sonIndexNoGetir(String str, String kelime) {
        return str.lastIndexOf(kelime);
    }
    //equals() // büyük küçük harf duyatrlı
    public static boolean esitMi(String a,String b){
      return a.equals(b);
    }
    //equalsIsIgnorcase() // büyük küçük harfe duyarsız
    public static boolean esitMiBuyukKucukIhmalEt(String a,String b) {
        return a.equalsIgnoreCase(b);
    }
    // == operatorleri sadece referansları kontrol eder Stringte olmaz

    // IsEmpty()
    public static boolean tamamenBosMu(String str){
        return str.isEmpty();
    }
    // IsBlank()
    public static boolean spaceHaricindeKarakterVarMi(String str){
        return str.isBlank();
    }
    //startsWith
    public static boolean bununlaBasliyorMu(String kelime,String kontrolEdilecekKelime){
        return kelime.startsWith(kontrolEdilecekKelime);
    }
    //endssWith
    public static boolean bununlaBitiyorMu(String kelime,String kontrolEdilecekKelime){
        return kelime.endsWith(kontrolEdilecekKelime);
    }
    //substring (int beginIndex)
    public static String indekstenItibarenYaz(String str,int index){
        return str.substring(index);
    }
    //substring (int beginIndex,int endIndex)
    //ilk index dahil, 2. index dahil deği
    public static String indekstenItibarenYaz(String str,int startindex,int endIndex){
        return str.substring(startindex,endIndex);
    }
}