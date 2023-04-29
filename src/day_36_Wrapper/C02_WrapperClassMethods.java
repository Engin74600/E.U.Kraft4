package day_36_Wrapper;

public class C02_WrapperClassMethods {
    public static void main(String[] args) {
        //valueOf
        //string ve int ve çağrıldığı method GÖEE DEĞER OLUŞTUR,
        String s = "123";
        int x = Integer.valueOf(s);
        int y = x + 5;
        System.out.println(y);

        // parseInt()
        //paremetre olarak string alıyor
        //int döndürüyor
        //ama nunprimitive değil primitive
        int z = Integer.parseInt("123");
        System.out.println(z);
        Integer.valueOf("123");//int döndürür
        //aralarında fark bu

        String str = "Bugün hava 40 derece;Bugün hava çok sıcak";
        //hava sıcaklığı 10 derece daha artarsa hava sıcaklığı
        //derece olur
        String[] arr = str.split(" ");
        int result = Integer.parseInt(arr[2]) + 10;
        System.out.println(result);
        int havasicakligi = Integer.parseInt(str.split(" ")[2]);//split ile array oldu string
        //yanına [] açıp istenilen elemanı tanımlayrak belirleyebiliriz
        String expectedResult1 = "Bugün hava çok sıcak";
        String expectedResult2 = "Bugün hava mevsim normallerinde";
        String actualResult = str.split(";")[1];

        if (havasicakligi >= 40) {
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        } else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }

        //Alinin doğum yılı 1996 ise 10 yıl sonra ali kaç yaşında olur
        String str1 = "Ali'nin doğum yılı 1996";
        String[] strArrayName = str1.split("'");
        String name=strArrayName[0];
        System.out.println(name);
        String[] strArrYil = str1.split(" ");
        int onSonrakiYas = 2023 - Integer.parseInt(strArrYil[3]) + 10;//doğum yılı[3]
        System.out.println(onSonrakiYas);
        System.out.println(name+" "+onSonrakiYas+" yaşında olur");

    }
}
