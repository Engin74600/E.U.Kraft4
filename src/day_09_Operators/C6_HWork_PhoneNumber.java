package day_09_Operators;

import java.util.Scanner;

public class C6_HWork_PhoneNumber {
    public static void main(String[] args) {
       /*
       Telefon Numarası adlı bir sınıf oluşturun ve aşağıdaki değişkenleri bildirin:
      ülkeKodu, alanKodu, yerelSayı
      Kullanıcıdan her bir değeri girmesini isteyin.
      Tarayıcı sınıfını kullanın ve bunları birer birer alın
      telefon numarasını şu şekilde görüntülemek için dize birleştirme kullanın:
              eski:
                          ülkeKodu = 90
                          alanKodu = 532
                          yerelSayı = 1234500

                      çıktı:
                              Telefon numaranız +(90)532-1234500
       */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ülke Kodunu girin : ");
        int ulkeKodu = sc.nextInt();
        System.out.print("Alan kodu griniz : ");
        int alanKod = sc.nextInt();
        System.out.print("Yerel sayıyı giriniz : ");
        int yerelSayi = sc.nextInt();

        System.out.println(" Girmiş olduğunuz telefon numarası :\n\t+("
        +ulkeKodu+")"+alanKod+"-"+yerelSayi);

    }
}
