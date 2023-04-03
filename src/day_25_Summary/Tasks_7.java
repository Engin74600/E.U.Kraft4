package day_25_Summary;

public class Tasks_7 {
    public static void main(String[] args) {
        //Dün akşam eve giderken onları görmüştüm Cümlesindeki ü
        //harfinin önünde ve arkasında olan harflerden bir string üreten
        //bir method yazın.
        String str1= "Dün akşam eve giderken onları görmüştüm";
        //            012345678901234567890123456789012345678
        System.out.println(kesdegistirbirlestir(str1));


    }
    public static String kesdegistirbirlestir(String str1){
        String kelime1=str1.substring(0, 3).replace("ü", "");
        String kelime2=str1.substring(33, 36).replace("ü", "");
        String kelime3=str1.substring(36, 39).replace("ü", "");
        String sonKelime=kelime1.concat(kelime2.concat(kelime3));
        return sonKelime;
    }
}
