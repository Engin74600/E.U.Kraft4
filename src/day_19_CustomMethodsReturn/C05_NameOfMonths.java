package day_19_CustomMethodsReturn;

public class C05_NameOfMonths {
    public static void main(String[] args) {
        System.out.println(nameOfMonths(5));


    }
    public static String nameOfMonths(int number){
        String name="";
        switch (number){
            case 1:
                name+="jan";
                break;
            case 2:
                name+="Feb";
                break;
            case 3:
                name+="Mar";
                break;
            case 4:
                name+="Apr";
                break;
            case 5:
                name+="May";
                break;
            case 6:
                name+="Jun";
                break;
            case 7:
                name+="Jul";
                break;
            case 8:
                name+="Aug";
                break;
            case 9:
                name+="Sep";
                break;
            case 10:
                name+="Oct";
                break;
            case 11:
                name+="Nov";
                break;
            case 12:
                name+="Dec";
                break;
            default:
                name+="İnvable";
        }
        return "Month name : "+name;
    }
}
