package day_19_CustomMethodsReturn;

public class C01_PractiseTaks2 {
    public static void main(String[] args) {
        khToLb(25000);
        System.out.println("--------------");
        double bagWeight=khToLb(23);
        System.out.println("---------------");
        System.out.println("bagWeight = " + bagWeight);
        System.out.println("----------------");
        singOfNumber(6);
        singOfNumber(-6);
        singOfNumber(0);
        eachCharInString("murat \ngilin damından atlayamadım");
        System.out.println("---------------");
        calculater(5,7,'+');
        calculater(5,7,'-');
        calculater(5,7,'*');
        calculater(5,7,'/');
        calculater(5,7,'?');
        calculater(5,7,'!');
        System.out.println("--------------------");

    }
/**
 * a method that can convert lire to dolar
 * @param tl
 */

    public static void ltToDollar(int tl){
        System.out.println(tl+" tl makes "+Math.round((tl/19.04)*100)/100.0+" uUSD");
    }
    /**
     * a method that can convert kh to lb
     * @param kg
     */
    public static double khToLb(double kg) {
        double result = 0;
        result = Math.round((kg * 2.20462262) * 100) / 100.0;
        return result;
    }

    /**
     * a method that can DETERMİNEif the inteher is positive, negative or zero
     * @param number
     **/

    public static void singOfNumber(int number){
        if (number<0){
            System.out.println(number+" is a negative number");
        } else if (number > 0) {
            System.out.println(number+" is positive number");
        } else {
            System.out.println(number+" is zero ");
        }
    }

    /**
     * a method named printEachChar that can print each characters of a string
     * @param str
     */
    public static void eachCharInString(String str){
        for (int i=0;i<str.length();i++){//.length() string bi ifadenin uzunluğunu ölçer
            System.out.print(str.charAt(i)+", ");//.charAt() ise string ifadeyi karakterlerini ayırır
        }
    }
/**
 *A method named calculator that passes three arguments (num1, num2, mathOperator),
 *   prints the calculation result
 * @param mathOperator
 * @param num1
 * @param num2
 */
public static void calculater(int num1,int num2,char mathOperator){
boolean valid = mathOperator=='+'|| mathOperator=='-'
        ||mathOperator=='*'|| mathOperator=='/';
if (valid){
    switch (mathOperator){
        case '+':
            System.out.println(num1+num2);
            break;
        case '-':
            System.out.println(num1-num2);
            break;
        case '*':
            System.out.println(num1*num2);
            break;
        case '/':
            System.out.println(num1/num2);
            break;
    }
}else {
    System.out.println("İnvalid Math Operator");
}
}

}
