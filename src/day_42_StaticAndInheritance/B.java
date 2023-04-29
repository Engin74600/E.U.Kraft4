package day_42_StaticAndInheritance;

public class B {
    public static int s=3;
    public int n;


    {//bu bir blok {} ve her obje oluşunca muhakkak çalışır.
        System.out.println("blok çalıştı");
    }
    {//bu bir blok {} ve her obje oluşunca muhakkak çalışır.
        System.out.println("blok 2 çalıştı");
    }



    public B(){}//construckter
    public B(int n){
        this.n=n;
    }
}
