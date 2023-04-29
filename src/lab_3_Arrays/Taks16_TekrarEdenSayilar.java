package lab_3_Arrays;

public class Taks16_TekrarEdenSayilar {
    public static void main(String[] args) {
        int [] y = {2,3,3,3,6,6,5,6,3};
        int [] y1 = {2,4,5,8,8};
        int [] y2 = {2,4,5,8};
        System.out.println(enCokTekrarEden(y));
        System.out.println(enCokTekrarEden(y1));
        System.out.println(enCokTekrarEden(y2));
    }
    /*Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
            [2,3,3,3,6,6,5,6,3] → 3
            [2,4,5,8,8] → 8
            [2,4,5,8] → -1*/

    public static int enCokTekrarEden(int[] arr){

        int maxcount=1;
        int deger=0;

        //1,1,1,5,8,8,8,8
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>maxcount){
                maxcount=count;
                deger=arr[i];
            }
        }
        if (maxcount==1){
            return -1;
        }
        return deger;
    }
    public static int enCokTekrarEden1(int[] x){
       int result=0;
        for (int i = 0,k=-1; i < x.length; i++,k++) {
           int adet=0;
            for (int j =i+1; j <x.length ; j++) {
                if (x[i] == x[j]&&x[i]!=x[k]){
                adet++;}
            }
            int max=0;
           if(max<adet){
                   System.out.println(max+" "+x[i]);
               max=adet;

            result=max;}
        }
        return result;
    }
    /*public static int enCokTekrarEden(int[] x){
        int adet=0;
        for (int i = 0,j=1; i < x.length; i++,j++) {
                if(x[i]==x[j]){
                adet++;
            }
                if()
            System.out.println(adet);
        }
        return adet;
    }*/

}
