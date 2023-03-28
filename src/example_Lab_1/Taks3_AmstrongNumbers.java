package example_Lab_1;

public class Taks3_AmstrongNumbers {
    public static void main(String[] args) {
        armstrongNumber();
    }

    /**
     * A method that prints the Amstrong numbers between 100 and 999
     */
    public static void armstrongNumber() {
        for (int i = 100; i <= 999; i++) {
            if (i == numberStep(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * a method that adds the cubes of the digits of a number
     * @param num
     * @return
     */
    public static int numberStep(int num) {
        int toplam = 0;
        while (num != 0) {
            toplam = (int) (Math.pow((num % 10), 3) + toplam);
            num /= 10;
        }
        return toplam;
    }
}
