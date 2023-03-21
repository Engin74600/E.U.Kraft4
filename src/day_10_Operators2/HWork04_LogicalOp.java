package day_10_Operators2;

public class HWork04_LogicalOp {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z = true;
        x= !y; //=false
        System.out.println("x = " + x);
        z = !x && x==z;
        // true&&false
        //    false
        System.out.println("z = " + z);


    }
}
