package day_19_CustomMethodsReturn;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println(max(9, 34));

    }
    public static int max(int a,int b){
        int result;
        if (a>b){
            result=a;
        }else {
            result=b;
        }
        return result;

    }
}
