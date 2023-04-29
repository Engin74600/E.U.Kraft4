package day_42_StaticAndInheritance;
import static java.lang.Math.*;
public class MainClass {
    public static void main(String[] args) {
        /*1)Static artık clasın genel bir unsurudur ve sınıfa ilk girdiğinde kod ilk onlara bakar.

          2)>Static bir değişkeni veya methodu her türlü çağırabiliriz
            >static olmayan bir methodu sadce sınıfı ile beraber çağırabiliriz.

          3)>Static bir methodu veya değişkeni , Static olmayan bir methodun içinde çağırabiliriz.
            >static olmayan bir method veya değişkeni static bir methodta çağıramayız

          4) this() keywordler objeye ait olduğu için staticte kullanılmaz

          5) >bir blok varsa her obje oluşumunda ilk  olarak ilgili constructera gider ve sonra bloka gider.
          dolayısıyla her bbir blok tüm oluşturulan objelerin bir unsuru olur
          > birden fazla blokta yukarıdan aşağı olarak sıra ile girer

          6)>Static Blok: diyelim ki bir bloka static tanımlanırsa aynı diğer staticler gibi kod ilgili sınıfa
          ilk girdiğinde diğer staticlerle ona da gider, belleğe atar,çalışır. bir daha da gitmez.
          >Normal Blok her obje oluşumunda ilgili construcktırdan sonra normal bloklara gider hermseferinde çalışır.
          >Normal bir blok diyelim ki bir şekilde bi construcktırın içine başka bi construckterı çağırsak bile,
          her halukarda sadece 1 kez çalışır,daha fazla değil

        */
        System.out.println("-------------------------------");
        B b=new B();//b clastaki constructer ile oluşturduk
        B b1=new B(5);
        B b2=new B(4);
        System.out.println("--------------------------------");
        /*7. şayet başka bir sınıfın tüm static methodlarını sadece adlarını yazarak sınıfa almak istersek:
        "package adı
        import static java.lang.Math.*
        Sınıf adı "
        yukarıda belirtilen yere ilgili sınıfın adını yazarak.burada Math. oldu
         */
        System.out.println(pow(b1.n, b2.n));
        System.out.println("-------------------------");

        //iç içe klaslar, DisClass sınıfında
        System.out.println(DisClass.Iclass.b);//iç klastanki veriyi çağırdım
        System.out.println(DisClass.a);//bu da dış klastan
        //iç klasın static olmasının tek avantajı bellektir. dış clasa girdiğinde ona gider ve bellekte durur.

        System.out.println("-----------------------");
        /*INHERİTANCE
        //Bird ve Animal sınıflarında olduğu gibi Bird sınıfını animal sınıfın çocuğu oldu.
        ondaki özellikleri kullanabilir.

        >extends ile bir sınıfını, Animal sınıfını ilşkillendirdik.*/

        C02_Bird bird =new C02_Bird();
        bird.name="Limon";
        bird.yemekYe();
        //animalda olup kendinde olmayan özelliklerle yeni obje oluşturduk yukarıdaki gibi
        System.out.println("-----------");
        C01_Animal animal=new C01_Animal();
        //bunun özellikleri sadece animal ile sınırlı

        C02_Bird bird1=new C02_Bird();
        bird1.name="Yakup";//animal class özellikleri
        bird1.yemekYe();//animal class özellikleri
        bird1.uc();//bird class özlelliği
        //>Animal'ın bir özelliği private yaparsak alt classlar kullanamaz

        //Multi level inheritancedede>baba>cocuk gibi düşün/Animal>Bird>Papagan
        C03_Papagan papagan = new C03_Papagan();
        System.out.println(papagan.name = "Şapşik");//C01_Animal
        System.out.println(papagan.isTalking = true);//C03_Papagan
        System.out.println(papagan.gagarengi = "Mavi");//C02_Bird
        papagan.uc();//C02_Bird
        papagan.yemekYe();//C01_Animal

        /*>İnheritance ilişkili claslarda Construckter Çağırma+
        >SUOPER
         Nasıl bir klastan yararlanarak bir obje olustururken java bos bir construckter oluşturursa
         child bir clasın construcktır yaparken biz görmesek de arka planda  super() oluşturulur
         this() keywordu içindeki clasın değişkenlerine işaret ederken
         super()keywordu parent klası işaret eder.
         >parent clasta argümanlı bir constructer varsa,
         child bir clasta herhangi bir constructer oluştururken onu da işaretlememiz
         super keywordu ile o argumaı eklmemezi lazım.CB_ChildClass'ta olduğu gibi
        o yüzden aşağıda meslek construckter çalıştılıp sadce konsolda meslek yazdırılırken
        cunstructerde name de var.
        zorunlu olarak çağırmamak için mutlaka parent clasta boç construckter yapılmalı
        */

        CB_ChildClass cb_childClass=new CB_ChildClass("Harun","Tester");
        System.out.println(cb_childClass.meslek);


    }
   /* public static double pow(double a,double b){
        int result =1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        return result;
    }*/
}
