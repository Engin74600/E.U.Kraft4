package day_16_BranchingStatements;

public class C03_Branching_Statement {
    public static void main(String[] args) {
        // break contunie return
      /* for (int i = 1; i <100 ; i++) {

           if (i==5) {

               break;
           }System.out.print(i+" ");
       }
       /* veya
       int x =1;
       for (int i = 1; i <100 ; i++) {
       x++;
           if (x==5) {
               break;
           }System.out.print(i+" ");
        }


        for (int j = 0; j <100 ; j++) {

            if (j % 2 == 0) {

                continue;
            } else if (j>10){
                break;
            }
            System.out.print(j + " ");
        }
        //0 ila 20 arası çift sayılartın toplamı
        int t=0;
        for (int i = 0; i <=20 ; i+=2) {
            if (i%2==0){
                t+=i;
            }
        }System.out.println(t);

        //1 ila 100 arası 5in katlarını yazdır
        for (int i = 0; i <=100; i++) {
            if (!(i%5==0)){
                continue;
            }
            System.out.println(i);
        }*/
        for (int i = 0; i <2 ; i++) {
            System.out.print("B");
            for (int j = 0; j <3 ; j++) {
                if (j==1) {
                    break;
                }
            }
            System.out.print("A");

        }
    }
}
