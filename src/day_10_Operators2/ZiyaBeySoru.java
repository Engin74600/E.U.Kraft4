package day_10_Operators2;

public class ZiyaBeySoru {
    public static void main(String[] args) {
        // ziya bey 12.03 discorttan sordu

        int a = 4;
        boolean s1 = a++==a;
        //      (Hala) 4==5(artık)
        //            false
        System.out.println("s1 = " + s1);
        // a bu aşamada hala 5
        boolean s2 = ++a==a;
        //      (artık)6==6(zaten)
        //             true
        System.out.println("s2 = " + s2);


    }
}
