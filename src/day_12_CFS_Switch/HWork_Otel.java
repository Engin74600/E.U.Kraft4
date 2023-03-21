package day_12_CFS_Switch;

import java.util.Scanner;

public class HWork_Otel {
    public static void main(String[] args) {
            /*
      3 katlı bir motel in
1.katında resepsion, güvenlik ve hizmetli odası var.
2 katında yemekhane, dinlenme salanu ve
Room1,Room2
3.katında ise Room3,Room4,Room5,Room6 vardır. Bir
switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım
alacagınız bir program(nested switch) yazın.
Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat
numarası girin ve oda adı seçin.
message 2 :
1.kat : Resepsion-Güvenlik-Oda hizmetleri
2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
3.kat : Room3-Room4-Room5-Room6
resepsion : tüm işlemleriniz için bekleriz
Güvenlik : profosyonel bir hizmettir
Oda hizmetleri : temizlik ve taşıma hizmetleri için 101
dahili hattan ulaşabilirsiniz
Yemekhane : kahvaltı 08-11
öğle yemeği 12-15
akşam yemeği 18-21
Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
Room1,Room2 : ekonomik oda
Room3,Room4 : standart oda
Room5,Room6 : özel oda
S
     */
        Scanner sc = new Scanner(System.in);

        System.out.println("Otelimize hoş geldiniz!\nLütfen bir kat seçiniz(1-2-3)");
        int kat = sc.nextInt();
        switch (kat) {
            case 1:
                System.out.println("1. Kat :\n\tResepsiyon(1),\n\tGüvenlik(2),\n\tOda Hizmetleri(3)\n\rLütfen bir Oda seciniz!");
                int kat1 = sc.nextInt();
                switch (kat1) {
                    case 1:
                        System.out.println("Resepsion : Tüm işlemleriniz için bekleriz");
                        break;
                    case 2:
                        System.out.println("Güvenlik : Profosyonel bir hizmettir");
                        break;
                    case 3:
                        System.out.println("Oda hizmetleri :Temizlik ve taşıma hizmetleri için\n101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("Yanlış bir seçim yaptınız");
                }
                break;
            case 2:
                System.out.println("2. Kat :\n\tYemekhane(1),\n\tDinlenme Salonu(2),\n\tRoom 1 (3)\n\tRoom 2(4)\n\rLütfen bir Oda seciniz!");
                int kat2 = sc.nextInt();
                switch (kat2){
                    case 1:
                        System.out.println("Yemekhane : kahvaltı 08-11\n\t öğle yemeği 12-15\n\t akşam yemeği 18-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("Ekonomik oda");
                        break;
                    case 4:
                        System.out.println("Ekonomik oda");
                        break;
                    default:
                        System.out.println("Yanlış bir işlem yaptınız");

                }break;
            case 3:
                System.out.println("3. Kat :\n\tRoom 3(1),\n\tRoom 4(2),\n\tRoom 5(3)\n\tRoom 6(4)\n\rLütfen bir Oda seciniz!");
                int kat3 = sc.nextInt();
                switch (kat3) {
                    case 1:
                        System.out.println("Room3 : Standart oda");
                        break;
                    case 2:
                        System.out.println("Room4 : Standart oda");
                        break;
                    case 3:
                        System.out.println("Room 5: Özel oda");
                        break;
                    case 4:
                        System.out.println("Room 6: Özel oda");
                        break;
                    default:
                        System.out.println("Yanlış bir seçim yaptınız");

                }break;
            default:
                System.out.println("Yanlış bir işlem yaptınız");
        }


    }
}
