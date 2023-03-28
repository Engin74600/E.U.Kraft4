package day_20_CustomMethodsOverloading;

public class C01_NameOfDay {
    public static void main(String[] args) {
        System.out.println(nameOfDay(3));

    }
    public static String nameOfDay(int daynumber ){
        String result;
        if (daynumber<1 || daynumber>7) {//geçersiz bir durum
            result ="Invalid";
        }else if (daynumber==1){
            result="Monday";
        }else if (daynumber==2){
            result="Tuesday";
        }else if (daynumber==3){
            result="Wednesday";
        }else if (daynumber==4){
            result="Thursday";
        }else if (daynumber==5){
            result="Friday";
        }else if (daynumber==6){
            result="Saturday";
        }else{
            result="Sunday";
        }
        return result;
    }
}
