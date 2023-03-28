package day_19_CustomMethodsReturn;

public class C07_İnitials {
    public static void main(String[] args) {
        System.out.println(initials("engin", "ulus"));

    }
public static String initials (String name,String lastname){
        String result="";
        result=name.charAt(0)+"."+lastname.charAt(0)+".";//kelimelerin ilk harfini aldım
        result=result.toUpperCase();//küçük harfleri büyük yapmak için
        return result;
}


}
