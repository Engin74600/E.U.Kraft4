package day_18_CustomMethods;

public class C04_PractiseTaks {
    public static void main(String[] args) {


        oddnumbers();
        System.out.println("----------");
        evennumbers();
        System.out.println("----------");
        alcoholAge(18);
        System.out.println("----------");
        voteAge(18, "TR");
        System.out.println("----------");
        eligibleToVote(18, "TR");
        System.out.println("----------");
        grades(99);
        System.out.println("--------------");
        calculateAreaCircle(9.9);
        System.out.println("---------------");
        convertToTL(199,19.04);
    }

    /**
     * a method that can print odd numbers between 1~100 in a same line saperated by space
     */
    public static void oddnumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    /**
     * a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static void evennumbers() {
        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }

    }

    /**
     * a method that can check if a person is eligible to buy alcohol
     */
    public static void alcoholAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Ineligible to buy alcohol");
        }
    }

    /**
     * a method that can check if a person is eligible to vote
     *
     * @param age
     * @param citizenship
     */
    public static void voteAge(int age, String citizenship) {

        if (age >= 18 && citizenship.equalsIgnoreCase("TR")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
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
     * a method that can calculate the grade of the student based on the score
     * score >= 90 grade 'A'
     * score >= 80 grade 'B'
     * score >= 70 grade 'C'
     * score >= 60 grade 'D'
     * score < 60 grade 'F'
     *
     * @param score
     */
    public static void grades(int score) {
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
        System.out.println("Your score : " + score + ", and your grade is " + grade);
    }

    /**
     * a method that can calculate the area of a circle
     *
     * @param radius
     */
    public static void calculateAreaCircle(double radius) {
        double area;
        area = Math.round(Math.PI * Math.pow(radius, 2));
        //küsüratlı ifadeleri yuvarlamak için Math.round()
        System.out.println("Circle with a radius " + radius + " cm has an area of " + area);

    }

    /**
     * a method that can calculate the area of a square
     *
     * @param side
     */
    public static void calculateAreaSquare(double side) {
        double area;
        area = side * side;
        System.out.println("Squre with a side " + side + " cm has an area of " + area);

    }
    /**
    * a method that can convert dollar to TL rate:19.04
     * @param dollar
     * @param rate
     *
    */
    public static void convertToTL(int dollar,double rate){
        double tl=dollar*rate;
        System.out.println(dollar+" dollars makes "+tl+" liras");

    }

}
