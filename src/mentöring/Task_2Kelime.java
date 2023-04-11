package mentöring;

public class Task_2Kelime {
    public static void main(String[] args) {
        System.out.println(ikiKelimeAyniMi("ennfes", "nefess"));

    }/* Soru 19) Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
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
}
