package my_litte_notbook;

public class StatementBranching_Break_Day16 {
    public static void main(String[] args) {
        int x =1;
        for (int i = 1; i <100 ; i++) {
            x++;
            if (x == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
