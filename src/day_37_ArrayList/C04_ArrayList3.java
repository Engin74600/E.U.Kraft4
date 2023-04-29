package day_37_ArrayList;

import java.util.ArrayList;

public class C04_ArrayList3 {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
      /*  listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500); */
      //  System.out.println(dublicate(listOfNums));
        // printListNumbers(listOfNums);
        ArrayList<Integer> sayi=new ArrayList<>();
        sayi.add(0,1);
        sayi.add(1,2);
        sayi.add(2,3);
        sayi.add(3,4);
        sayi.add(4,5);
        System.out.println(dondur(sayi, 3));


    }
    //5,10,15,15,20,25,25,100,100,500 rakamlarını
// listOfNums isili bir ArrayListe atın ve
//printListNumbers(listOfNums); methodu ile yazdıralım.
    public static void printListNumbers(ArrayList arrList){//burada sadece yazdırma olduğu için arrayList tipi istemez
        for (int i = 0; i < arrList.size() ; i++) {//size ile uzunluk
            System.out.print(arrList.get(i)+" ");//get ile indeksi getirme
        }
    }
//sum(listOfNums); methodu ile de toplam değeri döndürelim.

    public static int sum(ArrayList<Integer> arrayList){//burada erturn yaptığımız için arrayList tipi gerekli
        int result=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            result+=arrayList.get(i);
        }
        return result;

    }

    //duplicate(listOfNums); methodu ile de değerleri dublicate edip list i döndürelim.

    public static ArrayList<Integer> dublicate(ArrayList<Integer> arrList){

        ArrayList<Integer> arrListYeni=new ArrayList<>();

        for (int i = 0; i <arrList.size() ; i++) {
            arrListYeni.add(arrList.get(i));
            arrListYeni.add(arrList.get(i));
        }
        return arrListYeni;

    }

    //"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    // toIntList(stringNums); methodu Integer bir arrayList e convert edip döndürelim.

    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){

        ArrayList<Integer> arrIntList=new ArrayList<>();

        for (int i = 0; i <arrStringList.size() ; i++) {
                arrIntList.add(Integer.valueOf( arrStringList.get(i)));//stringi inte çevirmek içib valueOf kullandık
            // add ile de yeni arrayListe ekledik
        }
        return  arrIntList;

    }

    // yeni bir arrayList oluşturun içerisine 5 adet sayı ekleyin
    // dondur(int x) x kadar sayıları kendi içerinde döndürsün
    //  1 2 3 4 5    dondur(int 1)  51234    dondur(int 3)  34512  dondur(2)    45123 yeni bir arrylist
    public static ArrayList<Integer> dondur(ArrayList<Integer> arrayList,int dondurmesSayisi){
        ArrayList<Integer> yeniArrayList=arrayList;

        for (int i = 0; i <arrayList.size()+1-dondurmesSayisi; i++) {
            yeniArrayList.add(i,arrayList.get(i+dondurmesSayisi-1));
        }
        return yeniArrayList;
    }






    //squared(listOfNums); methodu ile de değerleri kendi ile çarpıp list i döndürün. ödev

  //ArrayList<Integer> myList = getList(20);//return method System.out.println(myList); ödev
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
}

