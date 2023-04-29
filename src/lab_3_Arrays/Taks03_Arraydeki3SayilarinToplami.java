package lab_3_Arrays;

public class Taks03_Arraydeki3SayilarinToplami {
    public static void main(String[] args) {

    }
    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThrees(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i==3){
                sum+=i;
            }
        }
        return sum;
    }
}
