package my_litte_notbook;

public class Loop_DoWhile_Day14 {
    public static void main(String[] args) {
        boolean a= false;
        for (int i=0; a;){// hatalı olduğu için yazdırmayacak
            System.out.println("Hi World -for loop");
        }
        System.out.println("-------------");
        while (a){//hatalı olduğu için bu da yazdırmayacak
            System.out.println("Hi World -while loop");
        }
        System.out.println("-----------------");
        do{
            System.out.println("hello World -Do while loop");
        } while (a);// yanlış olsa da bir kere çalıştıracak
    }
}
