package day_27_String_Lab2;

public class TaksİsaEsitHarf {
    public static void main(String[] args) {
        String str1 = "İftar";
        String str2 = "TARİF";
        String str3 = "ennfes";
        String str4 = "nefess";

        System.out.println(harflerVarMi(str1, str2));
        System.out.println(harflerVarMi(str1, str3));
        System.out.println(harflerVarMi(str3, str4));

    }

    public static boolean harflerVarMi(String str1, String str2) {
        str1 = str1.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        str2 = str2.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        if (str1.length() == str2.length()) {//uzunluklar eşit değilse zaten gerisine bakmaya gerek yok
            String control = "";//char değeri stringe atayaııp contains'se sokmak için
            for (int i = 0; i < str1.length(); i++) {//her harfi kontrol için var mı diye
                control += str2.charAt(i);
                if (str1.contains(control)) {//herdöngüdeki harf var mı diye kontrol ediyor varsa
                    return true;
                }

            }
        }
        return false;//yoksa
    }

    public static boolean harflerVarMi2(String str1, String str2) {
        str1 = str1.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        str2 = str2.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        if (str1.length() == str2.length()) {//uzunluklar eşit değilse zaten gerisine bakmaya gerek yok
            String control = "";//char değeri stringe atayaııp contains'se sokmak için
            for (int i = 0; i < str1.length(); i++) {//her harfi kontrol için var mı diye
                control += str2.charAt(i);
                if (str1.charAt(i) == str2.charAt(i) && str1.contains(control)) {//herdöngüdeki harf var mı diye kontrol ediyor varsa
                    return true;
                }

            }
        }
        return false;//yoksa
    }
}
