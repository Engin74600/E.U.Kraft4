package day_32_Arrays_2;

import java.util.Scanner;

public class C02_Array_Example {
    public static void main(String[] args) {

        //kullanıcıdan alınan 3 farklı elimeyi array içine atın
        String[] array= new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("1.kelime");
        String kelime1= sc.nextLine();
        array[0]=kelime1;
        System.out.println("2.kelime");
        String kelime2= sc.nextLine();
        array[1]=kelime2;
        System.out.println("3.kelime");
        String kelime3= sc.nextLine();
        array[2]=kelime3;
        System.out.println("Girmiş olduğun kelimelerden hamgisini istiyorsun?1-2-3");
        int tercih=sc.nextInt();
        switch (tercih){
            case 1:
                System.out.println("array[0] = " + array[0]);
                break;
            case 2:
                System.out.println("array[1] = " + array[1]);
                break;
            case 3:
                System.out.println("array[2] = " + array[2]);
                break;
            default:
                System.out.println("hatalı giriş");
        }

    }
}
