package day_21_ClassAndObject;

public class C01_Summary_Return {
    public static void main(String[] args) {

       // int x = seven();
        //seven2();
        max(1,3);
    }

    // f()=7
    public static int seven() {
        return 7;
    }

    public static int seven2() {
        int i = 0;
        while (true) {
            i++;
            if (1 == 5) {
                continue;
            } else if (i == 7) {
                return i;//return dendiği zaman method'tan çıkar
                //aynı döngülerde break gibib
            }
            System.out.println(i);
        }
    }

    public static int max(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
}