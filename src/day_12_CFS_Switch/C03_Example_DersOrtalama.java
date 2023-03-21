package day_12_CFS_Switch;

public class C03_Example_DersOrtalama {
    public static void main(String[] args) {
        //öğrenci ortalaması
        // ortalama 50 altı zayıf
        //50-70 arası zayıf
        //70-85 iyi
        //85 v eüzeri pek iyi
        //85 üzerine 95 üzeri mi kontrol edin
        //üzerindeyse onur belgesi verilsi
        double orta = 95;
        if (orta<50){
            System.out.println("Zayıf");
        } else if (orta<70){
            System.out.println("orta");
        } else if (orta<85){
            System.out.println("iyi");
        } else {
            System.out.println("pek iyi");
            if (orta>=95){
                System.out.println("Başarı belgesi kazandınız");
            }
        }



    }
}
