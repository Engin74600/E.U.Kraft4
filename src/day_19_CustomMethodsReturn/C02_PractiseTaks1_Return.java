package day_19_CustomMethodsReturn;

public class C02_PractiseTaks1_Return {
    public static void main(String[] args) {


        System.out.println(oddnumbers());
        System.out.println("----------");
        System.out.println(evennumbers());
        System.out.println("----------");
        System.out.println(alcoholAge(18));
        System.out.println("----------");
        System.out.println(voteAge(18, "TR"));
        System.out.println("----------");
        eligibleToVote(18, "TR");
        System.out.println("----------");
        System.out.println(grades(99));
        System.out.println("--------------");
        System.out.println(calculateAreaCircle(9.9));
        System.out.println("---------------");
        System.out.println(calculateAreaSquare(22));
        System.out.println("-----------------------");
        System.out.println(convertToTL(199, 19.04));

    }

    /**
     * a method that can print odd numbers between 1~100 in a same line saperated by space
     */
    public static String oddnumbers() {
        String result ="";
        for (int i = 1; i < 100; i += 2) {
            result +=i+" ";
        }
        return result;
    }

    /**
     * a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static String evennumbers() {
        String result = "";
        for (int i = 0; i < 100; i += 2) {
            result+=i + " ";
        }
        return result;
    }

    /**
     * a method that returns a boolean if a person is eligible to buy alcohol
     * @param age
     */
    public static boolean alcoholAge(int age) {
        boolean eligible;
        if (age >= 18) {
            eligible=false;
        } else {
            eligible=true;
        }
        return eligible;
    }

    /**
     * a method that can check if a person is eligible to vote
     *
     * @param age
     * @param citizenship
     */
    public static boolean voteAge(int age, String citizenship) {
        boolean isEligible = age>=18 && citizenship.equalsIgnoreCase("TR");
        return isEligible;
    }

    /**
     * a method that can check if a person is eligible to vote
     *
     * @param age
     * @param citizenship
     */
    public static void eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        System.out.print("You are ");
        if (!isEligible) System.out.println("not");//bu tarz kullanım ile
        // şartı komtrol ettikten sonra diğer satırı her halukardayazdırığından
        //aradaki olumsuz "not" ifadesi sadece tutmayan durumlarda yazılcaka
        System.out.println(" eligible to vote");
    }

    /**
     * a method that return calculate the grade of the student based on the score
     * score >= 90 grade 'A'
     * score >= 80 grade 'B'
     * score >= 70 grade 'C'
     * score >= 60 grade 'D'
     * score < 60 grade 'F'
     *
     * @param score
     */
    public static char grades(int score) {
        char grade;
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        return grade;
    }

    /**
     * a method that can calculate the area of a circle
     *
     * @param radius
     */
    public static double calculateAreaCircle(double radius) {
        double area;
        area = Math.round(Math.PI * Math.pow(radius, 2));
        //küsüratlı ifadeleri yuvarlamak için Math.round()
        return area;
    }

    /**
     * a method that can return the area of a square
     *
     * @param side
     */
    public static double calculateAreaSquare(double side) {
        double area;
        area = side * side;
        return area;

    }
    /**
    * a method that can convert dollar to TL rate:19.04
     * @param dollar
     * @param rate
     *
    */
    public static double convertToTL(int dollar,double rate){
        double tl=dollar*rate;
        return tl;
    }

}
