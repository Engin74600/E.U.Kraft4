package day_15_If_Else_Switch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {
        // alinın 100 tl varsa ve zamanı varsa sinemaya gitsin
        //yoksa evde kalsın
        int aliParasi=120;
        boolean azaman= true;
        if (aliParasi>=100){
            if (azaman){
                System.out.println("Sinemaya gidebilir");
            } else{
                System.out.println("zaman ve parası yok");
            }
        } else {
            System.out.println("parası yok, gidemez");
        }

        //veya
        if (aliParasi>=100&&azaman){
            System.out.println("sinemaya gidebilir");
        }else {
            System.out.println("sinemaya gidemez");
        }

    }
}
