package day_29_FullReview1;

public class C01_CustomMethodsVoid {
    public static void main(String[] args) {
        oddOrEven(154);
        ageOfPerson(1983);
        printNumbers(55,63);

    }
    public static void oddOrEven(int num){
        if (num%2==0){
            System.out.println(num+" is an Even number");
        } else {
            System.out.println(num+" is an Odd naumber");
        }
    }

    public static void ageOfPerson(int birthYear){
        int age= 2023 - birthYear;
        System.out.println("Youre age is "+age);
    }
    public static void printNumbers(int x, int y){
        for (int i=x+1; i<y;i++){
            System.out.print(i+" ");
        }
    }
}
