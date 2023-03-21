package day_16_BranchingStatements;

import java.util.Scanner;

public class HWork_BankaMenü {
    public static void main(String[] args) {
        //banka menüsü
        //1 Para Ekleme 1 hesapta para 3 Para Çek 4 kart iade
        // while ile işleme devam 1 üst menü 2 çıkış 3

        Scanner sc = new Scanner(System.in);
        int hesap = 2000;
        giris:
        while (true) {
            System.out.println("Bankamıza hoş geldiniz!");
            System.out.println("Mevcut Bakiyeniz : " + hesap);
            System.out.println("Yapmak istediğiniz işlemi seçin");
            System.out.println("1 Para Ekleme \n2 Hesabı Görme\n3 Para Çekme \n4 Kart İade");
            int tercih1 = sc.nextInt();
            paraekleme:
            if (tercih1 == 1) {
                while (true) {
                    System.out.println("Hesap Bakiye : " + hesap);
                    System.out.println("Eklemek istediğiniz miktarı girin :");
                    int ekmiktar = sc.nextInt();
                    int sonbakiye = hesap + ekmiktar;
                    System.out.println("Son bakiye : " + sonbakiye);
                    System.out.println("Yapmak istediğiniz işlemi seçin :");
                    System.out.println("\tİşleme devam için 1\n\tÜst menü için 2\n\tKart İade için 0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 == 1) {
                        hesap = sonbakiye;
                        continue;
                    } else if (tercih2 == 2) {
                        hesap = sonbakiye;
                        break paraekleme;
                    } else if (tercih2 == 0) {
                        hesap = sonbakiye;
                        break giris;
                    } else {
                        System.out.println("Hatalı bir işlem yaprınız\nİşlem sonlanıyor");
                        hesap = sonbakiye;
                        break giris;
                    }

                }

            } else hesapmenu:if (tercih1 == 2) {
                while (true) {
                    System.out.println("Hesap Bakiye : " + hesap);
                    System.out.println("Yapmak istediğiniz işlemi seçin :");
                    System.out.println("\tÜst menü için 2\n\tKart İade için 0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 == 2) {
                        break hesapmenu;
                    } else if (tercih2 == 0) {
                        break giris;
                    } else {
                        System.out.println("Hatalı bir işlem yaprınız\nİşlem sonlanıyor");
                        break giris;
                    }

                }
            } else paracekme:if (tercih1 == 3) {
                while (true) {
                    System.out.println("Hesap Bakiye : " + hesap);
                    System.out.println("Çekmek istediğiniz miktarı girin :");
                    int cekmiktar = sc.nextInt();
                    int sonbakiye = hesap - cekmiktar;
                    System.out.println("Son bakiye : " + sonbakiye);
                    System.out.println("Yapmak istediğiniz işlemi seçin :");
                    System.out.println("\tİşleme devam için 1\n\tÜst menü için 2\n\tKart İade için 0");
                    int tercih2 = sc.nextInt();
                    if (tercih2 == 1) {
                        hesap = sonbakiye;
                        continue;
                    } else if (tercih2 == 2) {
                        hesap = sonbakiye;
                        break paracekme;
                    } else if (tercih2 == 0) {
                        hesap = sonbakiye;
                        break giris;
                    } else {
                        System.out.println("Hatalı bir işlem yaprınız\nİşlem sonlanıyor");
                        hesap = sonbakiye;
                        break giris;
                    }

                }

            } else if (tercih1 == 4) {
                System.out.println("Biz Tercih ettiğiniz için teşekkürler");
                break giris;
            } else {
                System.out.println("Hatalı bir işlem yaptınız.\nTekrer tercih yapınız\n\n");
                continue;
            }
        }
        System.out.println("İşleminiz sonlandırıldı\n\tKartınızı Alınız");
    }
}
