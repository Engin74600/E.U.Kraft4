package my_litte_notbook;

public class Concatenation_Day06 {
    public static void main(String[] args) {
        String a= "Merhaba ";
        String b= "Dünya";
        String c= a+b;
        System.out.println(c+" Bugün nasılsın?");
        System.out.println(2+5+c);// 7 Merhaba dünya
        System.out.println(a+2+5);// merhaba25
        // çünkü ilk veri sring olunca devamı da string algılar
        System.out.println(3*4+a+7+8);//12merhaba78
        //çünkü ilk int verilerden sonra gelen string
        //sonrasını string kabul eder
        //öncesini çarpar, sonrasını string görür
        int i=10;
        System.out.println(i+3+8+a+(2+5)+7+" dünya");
        //21merhaba77 dünya
        //önce işlemler,sitringten sonrası string gibi
        //parantez içi işlem


    }
}
