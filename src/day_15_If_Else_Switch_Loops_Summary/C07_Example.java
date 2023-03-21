package day_15_If_Else_Switch_Loops_Summary;

public class C07_Example {
    public static void main(String[] args) {
        for (int i = 100; i >0 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        int i =100;
        while (i>0){
            System.out.print(i+" ");
            i-=2;

        }
        System.out.println("-------");
        //0 ile 20 arası sayıların küpü
        for (int j = 0; j <=20 ; j+=3) {
            System.out.print((int)Math.pow(j,3)+" ");

        }
    }
}
