package day_10_Operators2;

public class C04_UnaryOperators {
    public static void main(String[] args) {
        //+,-,++,--
        int num1 = +3;
        int num2 = -2;

        System.out.println(num1>0); // tru
        System.out.println(num2>0); // false
        System.out.println("----------\n");
        int a = 10;
        ++a; // pre increment : sayının değerini hemen arttırır.
        System.out.println("a = " + a);
        --a; // pre decrement : değerini hemen bir azaltır.
        System.out.println("a = " + a);
        System.out.println("----------\n");
        int b = 99;
        System.out.println("b = " + ++b);// 100
        int c = 99;
        System.out.println(c++); // post increment c'yi konsola 99 yazdıracak,sonraki satırda
        System.out.println("c = " + c);// yani burada 100 yazdıracak

        System.out.println("------------");
        int x = 201;
        System.out.println(--x);//200
        int y = 201;
        System.out.println(y--); // post decrement consala 201 > sonra 200
        System.out.println("y = " + y);// 200

        System.out.println("-------");
        int z = 44;
        System.out.println(++z); // 45
        System.out.println(z++);// 45,> sonra 46
        System.out.println(z++);// 46,> 47

        int i = 42;
        System.out.println(--i);//41
        System.out.println(i--);//41,sonra>40
        System.out.println(i);//40



    }
}
