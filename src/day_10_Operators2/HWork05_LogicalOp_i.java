package day_10_Operators2;

public class HWork05_LogicalOp_i {
    public static void main(String[] args) {
        int i =2;
        boolean ln;
        ln = --i==i || i<1;
        //     1==1 || 1<1 ?
        //     true || false
        //         False
        System.out.println("ln = " + ln);
        System.out.println("----\n");
        ln = i++==i || i<1;
        //    1 ==1 || 2<1
        //     true || true
        //         False
        System.out.println("ln = " + ln);

    }
}
