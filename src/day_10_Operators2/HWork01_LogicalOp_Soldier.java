package day_10_Operators2;

public class HWork01_LogicalOp_Soldier {
    public static void main(String[] args) {
        int age = 20;
        String healt =  "healty";
        boolean toBesoldier = age>=20&&healt=="healty"; // true
        //                      true && true
        System.out.println("to Be soldier = " + toBesoldier);


        toBesoldier = age==22 && healt == "healty" ||  age>19 && healt == "poorly";
        //              false && true              ||   false && False
        //                    false                ||   false
        //                                         false
        System.out.println("toBesoldier 2. sonuç = " + toBesoldier);


    }
}
