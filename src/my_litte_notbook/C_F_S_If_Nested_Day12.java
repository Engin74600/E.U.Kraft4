package my_litte_notbook;

import java.util.Scanner;

public class C_F_S_If_Nested_Day12 {
    public static void main(String[] args) {
    // bi restoran girişinde kullanıcıya
    // 18 yaşında olup olmadığını sorsun
    // cvp 18 altı ise giremezseniz şeklinde
    // bir yazı çıksın
    // 18 v üzeri ise yanında bayan olup olmadığı sorulsun
    // yoksa giremez
    Scanner sc = new Scanner(System.in);
    System.out.println("Lütfen yaşınızı girin :");
    int yas = sc.nextInt();
    if (yas >=18){
        sc.nextLine();
        System.out.println("Restoranımıza hoş geldiniz.");
        System.out.println("Beraberinizde bir partneriniz var mı?(evet/hayır");
        String cvp = sc.nextLine();
        if (cvp.equals("evet")){
            System.out.println("Buyrun! Sizi ağırlamaktan memnuniyet duyarız");
        } else {
            System.out.println("prensiplerimiz gereği, damsız içeri alamıyoruz.\n Anlayışınız için teşekkür eder, muhakkak yine bekleriz");
        }
    }else {
        System.out.println("Prensiplerimiz gereği 18 yaşından küçükler içeri alınmıyor.\n\tAnlayışınız için teşekkür eder yine bekleriz.");
    }

}
}
