package day_39_ConstructorOverloading;

public class C01_StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Mehmet",25,'M',95,123456);
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        System.out.println();
        student1.name="Osman";
        student1.age=18;
        student1.gender='m';
        student1.grade=83;
        student1.id=47485;
        System.out.println("student1.name = " + student1.name);

        System.out.println(student1);

    }
}
