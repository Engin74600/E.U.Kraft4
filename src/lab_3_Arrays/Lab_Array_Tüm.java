package lab_3_Arrays;

import day_30_FullReview2.C03_isPrime;
import day_32_Arrays_2.C04_Arrays_Methods;

import java.util.Arrays;
import java.util.Random;

public class Lab_Array_Tüm {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 3, 3};
        System.out.println("-------Soru1------");
        //System.out.println(sumOfArrayElements(numbers));

        System.out.println("\n-------Soru2--------");
        //System.out.println(sumOfEvenElements(numbers));

        System.out.println("\n-------Soru3--------");
        //System.out.println(sumOfThrees(numbers));

        System.out.println("\n-------Soru4--------");
        //System.out.println(arryMaxAndMin(numbers));

        System.out.println("\n-------Soru5--------");
        //System.out.println(Arrays.toString(enKucuguHepsineAta(numbers)));

        System.out.println("\n-------Soru6--------");
        //System.out.println(Arrays.toString(arrayOlusturma(8, 15)));

        System.out.println("\n-------Soru7--------");
        int[] numbers1 = {23, 54, 8, 96, 9, 41};
        int[] numbers2 = {22, 55, 7, 99, 6, 45};
        //System.out.println(Arrays.toString(arrayBirlestirme(numbers1, numbers2)));
        //C04_Arrays_Methods.arrayYazdir(arrayBirlestirme(numbers1,numbers2));

        System.out.println("\n-------Soru8--------");
        int[] numbers3 = {54, 96, 9};
        //System.out.println(sayilarVarMi(numbers3, numbers1));
        //System.out.println(sayilarVarMi(numbers1, numbers2));

        System.out.println("\n-------Soru9--------");
        //C04_Arrays_Methods.arrayYazdir(tersCevir(numbers1));

        System.out.println("\n-------Sor10--------");
        //C04_Arrays_Methods.arrayYazdir(randomArray());

        System.out.println("\n-------Sor11--------");
        //C04_Arrays_Methods.arrayYazdir(randomArray500());

        System.out.println("\n-------Sor12--------");
        //System.out.println(randomArray500deVarMi(125));

        System.out.println("\n-------Sor13--------");
        //System.out.println(randomArrayIkinciEnBuyuk());

        System.out.println("\n-------Sor14--------");
        int[] num11 = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        int[] num12 = {2, 4, 5, 8, 8};
        int[] num13 = {1, 2, 3};
        int[] num14 = {2, 3};

        //System.out.println(ardisikUcSayiVarMi(num11));
        //System.out.println(ardisikUcSayiVarMi(num12));
        //System.out.println(ardisikUcSayiVarMi(num13));
        //System.out.println(ardisikUcSayiVarMi(num13));

        System.out.println("\n-------Sor15--------");
        int[] x  = {2, 3, 3, 4, 5, 6, 5, 6, 3}; // 2,4,5,6,3
        int[] x2 = {2, 3, 5, 8, 8}; //2 3 5
        int[] x3 = {2, 2, 3}; // 3
        int[] x4 = {1, 2}; // 1,2
        //yalnizSayilar(x);
        //yalnizSayilar(x2);
        //yalnizSayilar(x3);
        //yalnizSayilar(x4);
        //System.out.println(aloneNumbers(x));
        //System.out.println(aloneNumbers(x2));
        //System.out.println(aloneNumbers(x3));
        //System.out.println(aloneNumbers(x4));

        System.out.println("\n-------Sor16--------");
        int [] y = {2,3,3,3,6,6,5,6,3};
        int [] y1 = {2,4,5,8,8};
        int [] y2 = {2,4,5,8};
        //System.out.println(enCokTekrarEden(y));
        //System.out.println(enCokTekrarEden(y1));
        //System.out.println(enCokTekrarEden(y2));

        System.out.println("\n-------Sor17--------");
        //System.out.println(dublicateVarMi(numbers4));
        //System.out.println(dublicateVarMi(numbers7));

        System.out.println("\n-------Sor18--------");
        String str = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
        char kontrol = 'o';
        //System.out.println(kacAdetVar(str, kontrol));

        System.out.println("\n-------Sor19--------");
        String str1 = "araba ile yola çıktık fakat araba arıza yaptı";
        String str2 = "araba ile yola çıktık fakat arıza yaptı";
        //System.out.println(dublicateKelimeVarMi(str1));
        //System.out.println(dublicateKelimeVarMi(str2));

        System.out.println("\n-------Sor20--------");
        //C04_Arrays_Methods.arrayYazdir(enKucukDegeriIlkIndexseAtama(numbers1));

        System.out.println("\n-------Sor21--------");
        int[] numbers8 = {2, 6, 9, 0, 5, 8, 4, 5, 8};
        //C04_Arrays_Methods.arrayYazdir(degerDegistirme(numbers8));

        System.out.println("\n-------Sor22--------");
        int[] sayi = {21, 7, 29, 12};
        //asalSayilar(sayi);

        System.out.println("\n-------Sor23--------");
        int[] sayi2={21,7,29,12,23,45,32,53};
        //System.out.println(Arrays.toString(sortNumbers(sayi2)));

        System.out.println("\n-------Sor24--------");
        int[] num6={1,1,2,3};
        int[] num7={2,5,5,5,9};
        int[] num8={5,5,5,5,9};
        int[] num9={5,5,5,5,5};
        int[] num10={5,1,5,1,5};
        //System.out.println(dublicateOlmayanlariTopla(num6));
        //System.out.println(dublicateOlmayanlariTopla(num7));
        //System.out.println(dublicateOlmayanlariTopla(num8));
        //System.out.println(dublicateOlmayanlariTopla(num9));
        //System.out.println(dublicateOlmayanlariTopla(num10));

        System.out.println("\n-------Sor25--------");
        int[] num1 = {1, 5, 9, 3};
        int[] num2 = {2, 5, 28, 36, 9};
        int[] num3 = {5, 3, 9, 11, 9};
        int[] num4 = {5, 5, 5, 5, 9};
        int[] num5 = {5, 9, 5, 1, 9};
        // System.out.println(toplama(num1));
        // System.out.println(toplama(num2));
        // System.out.println(toplama(num3));
        // System.out.println(toplama(num4));
        // System.out.println(toplama(num5));

        System.out.println("\n-------Sor26--------");
        int[] num15 = {5, 1, 9, 6, 1, 4, 7, 11, 25, 36};
        // System.out.println(Arrays.toString(Arrays.sort(num15)));
        //C04_Arrays_Methods.arrayYazdir(sonaAtama(num15, 1));


    }

    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double sumOfArrayElements(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }

//    Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThrees(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i == 3) {
                sum += i;
            }
        }
        return sum;
    }

    /*Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort
    kullanılmayacak)*/
    public static String arryMaxAndMin(int[] x) {
        int max = x[0];
        int min = x[0];
        String result = "";
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            } else if (min > x[i]) {
                min = x[i];
            }
        }
        result = "En büyük sasyı : " + max + "\nen küçük sayısı : " + min;
        return result;
    }

    /*
    Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
Arrays.fill kullanılmayacak)
[1,2,-8,-9] [-9,-9,-9,-9]
     */
    public static int[] enKucuguHepsineAta(int[] x) {
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = min;
        }
        return x;
    }

    /*
    Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
createArray(8,15) → [8,9,10,11,12,13,14,15]
     */
    public static int[] arrayOlusturma(int x, int y) {
        int fark = x - y;
        int[] result = new int[Math.abs(fark) + 1];
        int index = 0;
        if (x > y) {
            for (int j = y; j <= x; j++) {

                result[index] = j;
                index++;
            }
        } else {
            for (int j = x; j <= y; j++) {

                result[index] = j;
                index++;
            }
        }
        return result;
    }

    /*
    Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
oluşturan metodu yazınız.
[1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]
     */
    public static int[] arrayBirlestirme(int[] x, int[] y) {
        int[] yeniArray = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            yeniArray[i] = x[i];
        }
        int j = 0;
        for (int i = x.length; i < yeniArray.length; i++) {
            yeniArray[i] = y[j];
            j++;
        }
        return yeniArray;
    }

    /*
    Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
yer almıyorsa false yazdıran metodu yazınız.
[5,4,3,2,1] , [1,2,3,4,5,7,9] true
[5,4,3,2,1,7,5] , [1,2,3,4,5] false
     */
    public static boolean sayilarVarMi(int[] x, int[] y) {
        first:
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    continue first;
                }
            }
            return false;
        }
        return true;
    }

    /*Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
[5,4,3,2,1] -----------> [1,2,3,4,5]*/
    public static int[] tersCevir(int[] x) {
        int[] tersArray = new int[x.length];
        for (int i = 0, j = x.length - 1; i < x.length; i++) {
            tersArray[j] = x[i];
            j--;
        }
        return tersArray;
    }

    /*
    Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
     */
    public static int[] randomArray() {
        Random random = new Random();
        int number[] = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        return number;
    }

    /*
    Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
arasında rasgele sayılar atayın.
     */
    public static int[] randomArray500() {
        Random random = new Random();
        int number[] = new int[500];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50, 80);
        }
        return number;
    }

    /*
    Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
     */
    public static int randomArray500deVarMi(int x) {
        Random random = new Random();
        int number[] = new int[500];
        int adet = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(120, 140);
            if (number[i] == x) {
                adet++;
            }
        }
        return adet;
    }

    /*
    Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
(Array.sort kullanılmayacak)
     */
    public static int randomArrayIkinciEnBuyuk() {
        Random random = new Random();
        int number[] = new int[500];
        int max = number[0];
        int max2 = number[0];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(120, 140);
            if (number[i] > max) {
                max = number[i];
            }
            if (max != number[i] && number[i] > max2) {
                max2 = number[i];
            }
        }
        return max2;
    }

    /*
    Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
[2,3,3,4,5,6,5,6,3] → true
[2,4,5,8,8] → false
[1,2,3] → true
[1,2] → false
     */
    public static boolean ardisikUcSayiVarMi(int[] x) {

        for (int i = 0, j = 1, k = 2; i < x.length - 2; i++) {
            if (x[i] + 1 == x[j] && x[j] + 1 == x[k]) {
                return true;
            }
            j++;
            k++;
        }
        return false;
    }

    /*Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
            [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
            [2,2,5,8,8] →5
            [2,2,3] → 3
            [1,2] → 1,2
            */
    //void
    public static void yalnizSayilar(int[] x) {
        if (x[0] != x[1]) {
            System.out.print(x[0] + " ");
        }
        if (x.length >= 3) {
            for (int k = 0, i = 1, j = 2; i < x.length - 1; k++, i++, j++) {

                if (x[k] != x[i] && x[i] != x[j]) {
                    System.out.print(x[i] + " ");
                }
            }
        }
        if (x[x.length - 2] != x[x.length - 1]) {
            System.out.print(x[x.length - 1] + " ");
        }
        System.out.println("    ");
    }

    //return
    public static String aloneNumbers(int[] arr) {
        String result = "";
        if (arr[0] != arr[1]) {
            result += arr[0] + " ";
        }
        if (arr.length >= 3) {
            for (int k = 0, i = 1, j = 2; i < arr.length - 1; k++, i++, j++) {

                if (arr[k] != arr[i] && arr[i] != arr[j]) {
                    result += arr[i] + " ";
                }
            }
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            result += arr[arr.length - 1] + " ";
        }
        return result;
    }
    /*Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
            [2,3,3,3,6,6,5,6,3] → 3
            [2,4,5,8,8] → 8
            [2,4,5,8] → -1*/

    public static int enCokTekrarEden(int[] arr) {

        int maxcount = 1;
        int deger = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                deger = arr[i];
            }
        }
        if (maxcount == 1) {
            return -1;
        }
        return deger;
    }

    /*
    Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
[1,2,8,1] true
[25,89,78,98] false
     */
    public static boolean dublicateVarMi(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
harfi vardır. (Büyük ve küçük ihmal edilecek) */
    public static int kacAdetVar(String str, char ch) {
        str = str.toLowerCase();
        int adet = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                adet++;
            }
        }
        return adet;
    }

    /*
    Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
yazınız.
araba ile yola çıktık fakat araba arıza yaptı true
araba ile yola çıktık fakat arıza yaptı false
     */
    public static boolean dublicateKelimeVarMi(String str) {
        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
     indekslere 0 atayan metodu yazınız.
 [5,7,1,9] [1,0,0,0]
     */
    public static int[] enKucukDegeriIlkIndexseAtama(int[] x) {
        int[] yeniArr = new int[x.length];
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        yeniArr[0] = min;
        return yeniArr;
    }

    /*
    Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
[5,7,8,5,9] → [5,7,8,5,9]
     */
    public static int[] degerDegistirme(int[] x) {
        for (int i = 0, j = 1; i < x.length - 1; i++) {

            if (x[i] == 5 && x[j] == 8) {
                x[j] = 1;
            }
            j++;
        }
        return x;
    }

    /*Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
[21,7,29,12] ----→ 7 29*/
    public static void asalSayilar(int[] x) {
        for (int i = 0; i < x.length; i++) {

            if (asalMi(x[i])) {
                System.out.println(x[i]);
            }
        }
    }

    public static boolean asalMi(int x) {
        int bolen = 0;
        boolean result = false;
        for (int i = 2; i <= x; i++) {//sıfır modu olmaz. o yüzden 1
            if (x % i == 0) {
                bolen++;
            }
        }
        if (bolen == 1) {
            result = true;
        }
        return result;
    }
    /*
   Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
[21,7,29,12] ----→ [7,12,21,29]
    */
    public static int[] sortNumbers (int [] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] <arr[i]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    /*
    Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
toplamını veren metodu yazınız.
[1,1,2,3] → 5
[2,5,5,5,9] →11
[5,5,5,5,9] →9
[5,5,5,5,5] →0
[5,1,5,1,5] →17
     */
    public static int dublicateOlmayanlariTopla(int[] arr) {
        int result=0;
        out:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j&&arr[i]==arr[j]){

                    continue out;
                }
            }result+=arr[i];
        }
        return result;
    }


    /*
    Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki sayıları
toplama dahil etmeyin.
[1,5,9,3] → 4
[2,5,28,36,9] →2
[5,3,9,11,9] →20
[5,5,5,5,9] →0
[5,9,5,1,9] →0
     */
    public static int toplama(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == 5 && x[j] == 9) {
                    Arrays.fill(x, i, j + 1, 0);
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    /*
    Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
[5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]
     */
    public static int[] sonaAtama(int[] x, int y) {
        int[] yenix = new int[x.length];
        int sayi = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y) {
                yenix[sayi] = x[i];
                sayi++;
            }
        }
        for (int i = sayi; i < yenix.length; i++) {
            yenix[i] = y;
        }
        return yenix;
    }


}
