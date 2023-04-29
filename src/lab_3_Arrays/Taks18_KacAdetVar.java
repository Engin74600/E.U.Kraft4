package lab_3_Arrays;

public class Taks18_KacAdetVar {
    public static void main(String[] args) {
        System.out.println("\n-------Sor18--------");
        String str = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
        char kontrol = 'o';
        System.out.println(kacAdetVar(str, kontrol));

    }
    /*Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
harfi vardır. (Büyük ve küçük ihmal edilecek) */
    public static int kacAdetVar(String str, char ch) {
        str = str.toLowerCase();
        int adet = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                adet++;
            }
        }
        return adet;
    }
}
