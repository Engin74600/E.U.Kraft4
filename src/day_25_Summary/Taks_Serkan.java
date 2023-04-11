package day_25_Summary;

public class Taks_Serkan {
    public static void main(String[] args) {
        String msj="Ali babanın çiftliği";
        System.out.println(sesliHarf(msj));
        System.out.println("----------");
        System.out.println(sesliHarfBul(msj));

    }
    /*
        aldığınız msjın sesli harflerini a,e,i formatında
        konsola yazdırın
         */
    public static String sesliHarf(String str){
        if (str.contains("a")){System.out.print("a,");}
        if (str.contains("e")){System.out.print("e,");}
        if (str.contains("ı")){System.out.print("ı,");}
        if (str.contains("i")){System.out.print("i,");}
        if (str.contains("o")){System.out.print("o,");}
        if (str.contains("ö")){System.out.print("ö,");}
        if (str.contains("u")){System.out.print("u,");}
        if (str.contains("i")){System.out.print("ü");}
        return str;
    }
    public static String sesliHarfBul(String str) {
        String message="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e'||str.charAt(i) == 'ı' ||str.charAt(i) == 'i'
            ||str.charAt(i) == 'o' || str.charAt(i) == 'ö'||str.charAt(i) == 'u' || str.charAt(i) == 'ü') {
                message+=str.charAt(i)+", ";
            }
        }
        return message;
    }
}

