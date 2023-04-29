package day_39_ConstructorOverloading;

public class Student {
    public String name;
    public int age;
    public char gender;
    public int grade;

    public int id;


//    public Student(){

//    }

    public Student(String ad, int age, char gender, int grade, int id){
        //bu constructor'daki deişken isimleri classın objeleriyle aynı olunca
        //ki bu bi teamüldür
        //this()ile aynı olanların ilkinin class objesi oldugunu belirtiyoruz

        name=ad;
        this.age=age;
        this.gender=gender;
        this.grade=grade;
        this.id=id;
    }

    public String toString(){//direk "student" objesini yadırmak için içindeki 5 değişkenin de olduğu
        //bu methodu yazıyoruz
        //adı da yukardaki gibi teyamülen toString() oluyor
        return "Student{"+
                "name='"+name+"'"+
                ", age='"+age+"'"+
                ", gender='"+gender+"'"+
                ", grade='"+grade+"'"+
                ", id='"+id+"'}";

    }






}
