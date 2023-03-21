package day_15_If_Else_Switch_Loops_Summary;

public class C01_If_Else {
    public static void main(String[] args) {
//kullanıcının girdiği çift mi?
        int x=10;
        if (x%2==0){
            System.out.println("çift");
        }else {
            System.out.println("tek");
        }
        // sayı negatif mi pozitif mi 0 mı
        //kullanıcının girdiği çift mi?
        int y=10;
        if (y>0){
            System.out.println("pozitif");
        }else if(y<0){
            System.out.println("negatif");
        }else {
            System.out.println("Sıfır");
        }
    }

}
