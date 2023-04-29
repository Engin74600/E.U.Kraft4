package lab_3_Arrays;

public class Taks19_DublicateKelimeVarMi {
    public static void main(String[] args) {
        System.out.println("\n-------Sor19--------");
        String str1 = "araba ile yola çıktık fakat araba arıza yaptı";
        String str2 = "araba ile yola çıktık fakat arıza yaptı";
        System.out.println(dublicateKelimeVarMi(str1));
        System.out.println(dublicateKelimeVarMi(str2));
    }
     /*
    Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
yazınız.
araba ile yola çıktık fakat araba arıza yaptı true
araba ile yola çıktık fakat arıza yaptı false
     */

    public static boolean dublicateKelimeVarMi(String str) {
        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
