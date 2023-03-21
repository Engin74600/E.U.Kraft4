package day_04_VeriableCod;

public class Task_Rectangle {
    public static void main(String[] args) {

         /*3. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                           						length width
                           						area = length * width
                           						perimeter =  2 * (length + width)*/
        System.out.println("--------------\n>>>>Soru 3 \n  ");
        double length= 7;
        double width= 3;
        double area = length * width;
        double circle = 2 *(length+width);
        System.out.println("uzun kenarı : "+length+",\nkısa kenarı : "+width+"\nolan bir diktörtgenin" +
                "\nAlanı : "+area+"\nÇevresi : "+circle);
    }
}
