package day_16_BranchingStatements;

public class C06_NestedLoop_Branching {
    public static void main(String[] args) {
        outloop:
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            innerloop:
            for (int j = 0; j < 5; j++) {
                System.out.println("B");
                deeploop:
                for (int k = 0; k < 10; k++) {
                    System.out.println("C");
                    if (k == 0) {
                        break outloop;
                    }
                }
            }
        }

    }
}
