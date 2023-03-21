package my_litte_notbook;

public class OperatorsLogical_Day10 {
    public static void main(String[] args) {

        String name = "Ayşe";
        int age = 34;
        String citizen = "Turkey";
        // oy kullanmak için 18 yaş v tc vatandaşı şartı
        boolean isEligibleVote =  age >=18 && citizen =="Turkey";//stringlerin kontrolu == operator ile olmaz normalde
        //                          true   &&         true
        System.out.println(name+" is eligible vote = " + isEligibleVote);

        System.out.println("---------------\n");
        String name1 = "Ümit Bey";
        int findexScore = 800;
        int age1 = 43;
        int income = 40000;
        boolean isEligibileForLoan = findexScore >=1500 && age1>=18 && income >= 3000;
         //                                 flase       &&  true    && ture
        System.out.println(name1+" is eligibile For Loan = " + isEligibileForLoan);
        System.out.println("-----------\n");
        String name2 = "Hatice";
        int age2 = 21;
        char gender = 'F';
        boolean isEligible = age2>=18 &&  (gender == 'M' || gender=='F');
        //                       true &&  (     false    || true
        System.out.println(name2+" is Eligible to be selected as MP = " + isEligible);
        System.out.println("-------------\n");

        String student = "Ali";
        double gpa = 2.5;
        int familyInCome = 15000;
        boolean isEligibleForScholarship = gpa >= 3.5 || familyInCome <= 20000;
        //                                      false || ture
        //                                            true
        System.out.println(student+" is Eligible For Scholarship = " + isEligibleForScholarship);
        System.out.println("------------\n");

        boolean r = true;
        System.out.println("r = " + r);
        boolean r1 = !r;// false
        System.out.println("r1 = " + r1);
        System.out.println("------------\n");
        int score = 55;
        boolean passed = score>=60; // false
        boolean failed = !passed; // true
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
