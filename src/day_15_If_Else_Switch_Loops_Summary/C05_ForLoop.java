package day_15_If_Else_Switch_Loops_Summary;

public class C05_ForLoop {
    public static void main(String[] args) {
        for (int i=0; i<3;i++){

            System.out.println("Merhaba");
        }
        for (int i=0,k=5; i<3;i++,k+=5){
           // i=0 ve k==5;ien fazla 2 olacak;
            // i bir bir artacak,k her döngüde5le toplanacak
            System.out.println(k);//i kadar döngü olacak
            // k'yı yazdırdığımız için de döngü kadar 5 ile toplanacak
        }



    }
}
