package day_36_Wrapper;

public class C01_Wrapper {
    public static void main(String[] args) {
        int x=5;
        Integer y=new Integer(5);
        System.out.println(x+y);//10
        System.out.println(x==y);//true
        char c='e';
        Character cW=new Character('e');
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('!'));

        //System.out.println(Integer.max(50, 60));
        //System.out.println(Double.max(40.5, 54.7));

        Integer sayiW=new Integer(10);
        int sayiP=20;
        sayiP=sayiW;


    }
}
