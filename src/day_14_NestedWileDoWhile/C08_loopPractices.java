package day_14_NestedWileDoWhile;

public class C08_loopPractices {
    public static void main(String[] args) {
        System.out.println("-----For-----\n");

        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }

        System.out.println("\n----While----\n");
        int j= 1;
        while (j<=10){
            System.out.print(j+" ");
            j++;
        }

        System.out.println("\n----do While----\n");

        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }while (k<=10);
    }
}
