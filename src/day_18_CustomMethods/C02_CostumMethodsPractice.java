package day_18_CustomMethods;

public class C02_CostumMethodsPractice {
    public static void main(String[] args) {
        helloWorldTimes();
        System.out.println("--------------");
        countdownTenToZero();
        System.out.println("--------------");
        evenNumbers();
        System.out.println("--------------");

    }
//     a function that can print hello world 5 times ==> helloWorld5Times()
//     a function that print Ten to Zero  ==> countdownTenToZero()
//     a function that can print all the even numbers from 1 ~ 100 ==> evenNumbers

    /**
     *  a function that can print hello world 5 times ==> helloWorld5Times()
     */
    //yukarıdaki //* * */ yapı bir methoda eklenen not, izahtır
    public static void helloWorldTimes(){
        for (int i = 1; i <=5 ; i++) { //şayet bir loop'un bady {}
            // parantezini koymazsanız loop ilk satırı şler
            //looptan çıkar ve sıradaki satıra geçer
            //burada mesala 5 kez ilk satır Hi world yazdırır.
            //sonra sıradaki hi Worldü yazdırı,toplamda 6 adet
            System.out.println("Hi World");
            System.out.println("Hi World");

        }
    }

    /**
     * a function that print Ten to Zero  ==> countdownTenToZero()
     */
    public static void countdownTenToZero(){
        for (int i = 10; i >0 ; i--) {
            System.out.print(i+" ");

        }
    }

    /**
     * a function that can print all the even numbers from 1 ~ 100 ==> evenNumbers
     */
    public static void evenNumbers(){
        for (int i = 2; i <= 100 ; i+=2) {
            System.out.print(i+" ");


        }
    }
}
