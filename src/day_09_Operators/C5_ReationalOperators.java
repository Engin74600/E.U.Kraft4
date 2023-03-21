package day_09_Operators;

public class C5_ReationalOperators {
    public static void main(String[] args) {
     // >,<,>=,<=,==,!=
        boolean r1 = (60>40);
        System.out.println("r1 = " + r1);
        System.out.println("---------");
        boolean r2 = (200>=200);
        System.out.println("r2 = " + r2);
        System.out.println("---------");
        boolean r3 = (200>=300);
        System.out.println("r3 = " + r3);
        System.out.println("---------");
        int finedexScore =1650;
        boolean isEligibleForLoan = (finedexScore>=1500);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("---------");
        boolean r4 = 100 < 200;
        System.out.println("r4 = " + r4);
        System.out.println("---------");
        boolean r5 = 300 < 200;
        System.out.println("r5 = " + r5);
        System.out.println("---------");
        int score = 75;
        boolean hasFailed = score<=59;
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("---------");
        boolean r6 = 45<=60;
        System.out.println("r6 = " + r6);
        System.out.println("---------");
        int x = 100;
        int y = 200;
        boolean isEqul = x==y;
        System.out.println("isEqul = " + isEqul);
        System.out.println("---------");
        boolean r7 = "İhsan"=="Ahmet";
        // stirnglerde kullanmıyoruz bu =='tiri;
        System.out.println("r7 = " + r7);
        System.out.println("---------");
        boolean r8 = 'A'=='a';
        System.out.println("r8 = " + r8);
        System.out.println("---------");
        boolean r9 = "Java"=="Java";
        System.out.println("r9 = " + r9);
        System.out.println("---------");
        boolean r10 = 100!=200;
        System.out.println("r10 = " + r10);System.out.println("---------");
        boolean r11 = 200!=200;
        System.out.println("r11 = " + r11);
        System.out.println("---------");
        boolean r12 = "Java" != "Zor"; // stirng == kullanılmaz.
        System.out.println("r12 = " + r12);


    }
}
