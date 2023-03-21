package day_08_ScannerAndOperators;

public class C02_Birthday {
    public static void main(String[] args) {

String name = "John";
int birtDay = 23;
String monthOfBirth = "April";
int birthYear = 1990;

//john was born on April/23/1990
        System.out.println(name+" was born on "+monthOfBirth+"/"
                +birtDay+"/"+birthYear);
//john was born on "April\23\1990"
        System.out.println(name+" was born on \""+monthOfBirth+"\\"
                +birtDay+"\\"+birthYear+"\"");
    }
}
