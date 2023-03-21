package day_12_CFS_Switch;

public class C04_Switch_Case {
    public static void main(String[] args) {
        //byte,short, int, char, string tipindki değerleri karşılaştırılabilir
        // double,float, boolean değerler geçerli değil bu yapıda
        int sayi = 1;
        switch (sayi){
            case 1:
                System.out.println("Sayı 1'e eşit");
                break;//break görene kadar kod çalışır
            // mutlaka break yazılmalı
            case 2:
                System.out.println("Sayı 2'e eşit");
                break;
            case 3:
                System.out.println("Sayı 3'e eşit");
                break;
            default:
                System.out.println("sayı eşlenmedi");
        }

        String str = "balon";
        switch (str){
            case "kalem":
                System.out.println("balon'a eşit");
                break;
            case "silgi":
                System.out.println("balon'a eşit");
                break;
            case "balon":
                System.out.println("balon'a eşit");
                break;
            default:
                System.out.println("balon eşlenmedi");
        }
    }
}
