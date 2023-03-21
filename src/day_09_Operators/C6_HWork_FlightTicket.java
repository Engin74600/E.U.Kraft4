 package day_09_Operators;

public class C6_HWork_FlightTicket {
    public static void main(String[] args) {
        /*
      FlightTicket adlı bir sınıf oluşturun ve aşağıdakileri bildirin
      değişkenler:
              1. gelen
              2. için
              3. bilet fiyatı
          biletin tüm bilgilerini görüntülemek için birleştirme kullanın

              eski:
                  Ankara'dan İstanbul'a 599 TL
       */
        String gelen = "Anakara'dan ";
        String icin = "İstanbul'a ";
        String biletFiyatı = "599 TL";
        String nihayet = gelen+icin+biletFiyatı;
        System.out.println(nihayet);
        // veya
        System.out.println(gelen+icin+biletFiyatı);

    }
}
