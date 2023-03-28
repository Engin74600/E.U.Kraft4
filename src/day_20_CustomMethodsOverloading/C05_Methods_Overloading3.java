package day_20_CustomMethodsOverloading;

public class C05_Methods_Overloading3 {
    public static void main(String[] args) {
        concat(7,"cadaloz",true);

    }
    /*
     * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
     * Boolean true ise int ve String değeri concat yapsın.
     * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/
    public static void concat(int a, String str,boolean bl){
        if (bl) {
            System.out.println(a+" "+str);

        }else{
            concat(a,str);
        }
    }
    public static void concat(int a,String str) {
        for (int i =1 ; i <=a ; i++) {
            System.out.println(i+". "+str);}
    }
}
