package day_25_Summary;

public class Task {
    public static void main(String[] args) {

        String a="Merhaba";
        String b="ErMan";
        if (ikinciKelimedeVarMi(a,b)>=0){
            System.out.println("içinde var ve 2.kelimenin "
                    +ikinciKelimedeVarMi(a, b)+". indekstinde var");
        }else {
            System.out.println("2. Kelime içersinde yer almıyor");
        }

    }
    public static int ikinciKelimedeVarMi(String str1,String str2){
        //str1.trim().substring(0,1); de olur
        return str2.indexOf(str1.trim().charAt(0));
    }
}
