package day_25_Summary;

public class Taks_Trim_Method {
    public static void main(String[] args) {

        //System.out.println(trim3("   ali baba  "));
        String str="   Ali baba  ";


    }
    /*
    Pazartesiye kadar ödev: trim(String str) şeklinde bir metot yazın
    trim gibi çalışsın  ve string döndürsün.
    İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
     */
    public static String trim2(String str){
        if(str.contains(" ")){
            str=str.replace(" ","");
        }
        return str;
    }
    public static String trim3(String str){
        String rezerve="";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.startsWith(" ")) {
                rezerve = str.replace(" ", "");
            }
        }str=rezerve;
        for (int i = str.length()-1; i >=0; i--) {
            if (str.endsWith(" ")) {
                rezerve = str.replace(" ", "");
            }
        } return rezerve;
    }
    public static String terim4(String str){
        String str2="";
        for (int i = 0; i <str2.length() ; i++) {
            if (str2.endsWith(" ")){
                str.substring(1,str.length()-1);
            }
        }return str2;
    }


}
