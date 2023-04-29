package day_40_Encapsulation;

public class Employee {
    private String name;

    private char gender;

    private int age;

    private double salary;

    public Employee(String name, char gender, int age, double salary) {
//        this.name=name; this private'lerde işe yaramaz
        setName(name);//private değişlenlerde atama yapmak için ulaşma methodu set..
//        this.gender=gender;
        setGender(gender);
//        this.age = age;
        setAge(age);
//        this.salary = salary;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Please enter a valid name");
            return;
        }

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        this.salary = salary;
    }

    public String toString() {//tüm objeyi yazdırmak için
        //returnlü
        return "Employee{" +
                "name='" + name + "'" +
                ", gender='" + gender + "'" +
                ", age=" + age +
                ", salary=" + salary +
                "}";
    }


}
