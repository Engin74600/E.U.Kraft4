package day_20_CustomMethodsOverloading;

public class C04_MethodOverloading2 {
    public static void main(String[] args) {
        calculateArea(8,9);
        calculateArea(3);


    }
    /*CalculateArea isminde  method yazın ve overload
    olsun. Birincisi kare-dikdörtgen alanını hesaplasın.
    İkincisi dairenin alanını hesaplasın. PI: 3,14*/
    public static void calculateArea(int a, int b){
        System.out.println(a*b);
    }
    public static void calculateArea(int radius){
        System.out.println(Math.round(Math.PI*(Math.pow(radius,2))));
    }
//overloding methodu void'i return yaparak çeşitlendirilemez
}
