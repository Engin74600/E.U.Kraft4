package my_litte_notbook;

public class StatementBranching_Contunie_Day16 {
    public static void main(String[] args) {
        for (int j = 0; j <100 ; j++) {

            if (j % 2 == 0) {

                continue;
            } else if (j>10){
                break;
            }
            System.out.print(j + " ");
        }
    }
}
