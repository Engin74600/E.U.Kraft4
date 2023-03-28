package day_18_CustomMethods;

public class C03_CostumMethodsParameters {
    public static void main(String[] args) {
        oddOrEven(9);
        System.out.println("-----------");
        ageOfPerson(25);
        System.out.println("--------------");
        printNumber(49,39);

    }

    /**
     * a function that can check if a number is odd number or even number
     *
     * @param number
     */
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    /**
     * a method that can display the age of the person from the birthYear
     * @param birthyear
     */

    public static void ageOfPerson(int birthyear) {
        int age = 2023 - birthyear;
        System.out.println("Your age is " + age);
        System.out.println("---------------");


    }

    /**
     *  a method that can print all the numbers between X and Y
     * @param x
     * @param y
     */

    public static void printNumber(int x,int y){

        if (x<y){
        for (int i = x; i <y ; i++) {
            System.out.print(i+" ");
        }
        }else {
            for (int i = y; i <x ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
