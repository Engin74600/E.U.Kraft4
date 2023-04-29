package day_38_Constructors;

public class C01_StrongPassword {
    public static void main(String[] args) {

        String password ="WEwporksaopıfdıo=39w//^";
        String password1 ="WEwporksaopıfdıo39";
        String password2 ="WEwporksaopıfdıo=w//^";
        System.out.println(isStrongPassword(password));
        System.out.println(isStrongPassword(password1));
        System.out.println(isStrongPassword(password2));

    }

    /*
    Write a method that can verify if a password is a strong password.Characteristics of strongpasswords are:
    1.1 Password must be at least havce 8 characters long and should not contain space
    1.2 Password should at last contain one upper case latter
    1.3 Password should at last contain one lower case latter
    1.4 Password should at last contain one special characters
    1.5 Password should at last contain a digit
     */
    public static boolean isStrongPassword(String password) {
        //Password must be at least havce 8 characters long and should not contain space
        boolean lengthAndSpace = password.length() >= 8 && !password.contains(" ");
        boolean upperCase = false;//upper case
        boolean lowerCase = false;//lower case
        boolean specialCharacters = false;//special char
        boolean digit = false;//digit
        char[] chars = password.toCharArray();
        for (char eachChar : chars) {
            if (Character.isUpperCase(eachChar)) {//contain one upper case latter
                upperCase = true;
            } else if (Character.isLowerCase(eachChar)) {//contain one lower case latter
                lowerCase = true;
            } else if (Character.isDigit(eachChar)) {//contain a digit
                digit = true;
            } else {//diperleri kontrol edildiyse kalan özel karakterler (contain one special characters)
                specialCharacters = true;
            }
        }
        boolean isPasswordStrong= lengthAndSpace && lowerCase && upperCase && specialCharacters && digit;
        return isPasswordStrong;
    }
}
