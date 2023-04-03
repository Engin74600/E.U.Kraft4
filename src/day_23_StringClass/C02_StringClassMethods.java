package day_23_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {

        System.out.println("---LENGTH---\n");
        String programmingLanguage = "java";//String Pool da bi obje oluştu
        System.out.println("programmingLanguage.length() " + programmingLanguage.length());

        programmingLanguage = "python"; //S.poolda oluşan yeni  objeye referan oldu. ilki olan java boşa çıktı.
        System.out.println("programmingLanguage.length() " + programmingLanguage.length());

        System.out.println("\n-----TOUPPERCASE--&--tolonercase-----\n");
        System.out.println("programmingLanguage.toUpparCase() " + programmingLanguage.toUpperCase());
        //obje küçük sadece büyük yazdırıyor
        System.out.println("programmingLanguage = " + programmingLanguage);
        // obje hala küçük
        programmingLanguage = programmingLanguage.toUpperCase();
        // artık büyük haline atama yaptık, değişti
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        //büyük olanı küçük yapmıyor, sadece küçük yazdırıyor
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("\n----charAt()-----\n");
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));
        // büyük P (kelime PHYTON)
        // son harf içinse
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        //veya
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " +
                programmingLanguage.charAt(programmingLanguage.length() - 1));
        //java kelimenin harf sayısından fazla bi karakteri istersek hata vermez
        //ama yazdırırken hata veririr
        /*System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " +
                programmingLanguage.charAt(programmingLanguage.length())); */
        // t harfi için
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));
        //veya
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " +
                programmingLanguage.charAt(programmingLanguage.length() - 4));

        System.out.println("\n----concat()-----\n");
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.concat(\"Programlama dili java'dan daha kolaydır\") = "
                + programmingLanguage.concat(" Programlama dili java'dan daha kolaydır"));
        programmingLanguage = programmingLanguage.concat(" Programlama dili java'dan daha kolaydır");


        System.out.println("\n----contains()-----\n");
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.contains(\"dili\") = " + programmingLanguage.contains("dili"));
        System.out.println("programmingLanguage.contains(\"p\") = " + programmingLanguage.contains("p"));//false çünkü büyük// küçük harfe duyarlı
        System.out.println("programmingLanguage.contains(\nP\n) = " + programmingLanguage.contains("P"));//true
        System.out.println("programmingLanguage.contains(\" dili j\") = " + programmingLanguage.contains(" dili j"));

        System.out.println("\n----trim()-----\n");
        String s = "     Hello    World  ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());// sadece yazdırırken boşlukları alır,
        //kalıcı olsun dersek
        //başka bir değişkenle
        String trimedS = s.trim();
        System.out.println("trimedS = " + trimedS);


        System.out.println("\n----replace()-----\n");
        System.out.println("s.replace(\"Hello\",\"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimedS.replace(\"Hello\",\"Developer\") = " + trimedS.replace("Hello", "Developer"));
        System.out.println("trimedS.replace(\"Hel\",\"\") = " + trimedS.replace("Hel", ""));


        System.out.println("\n----indexOf()-----\n");
        System.out.println("trimedS.indexOf(\"H\") = " + trimedS.indexOf("H"));
        System.out.println("trimedS.indexOf(\"HELL\") = " + trimedS.indexOf("HELL"));
        System.out.println("trimedS.indexOf(\"Wo\") = " + trimedS.indexOf("Wo"));

    }
}
