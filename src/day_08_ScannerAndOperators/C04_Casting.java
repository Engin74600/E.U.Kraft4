package day_08_ScannerAndOperators;

public class C04_Casting {
    public static void main(String[] args) {
        float bodyTemperature = 36.5F;
        byte num1 = (byte) bodyTemperature; //explicit,narrowing,manuel
        short num2 = (short) bodyTemperature; //explicit,narrowing,manuel
        int num3 = (int) bodyTemperature;//explicit,narrowing,manuel
        long num4 = (long) bodyTemperature; //explicit,narrowing,manuel
        float num5 = bodyTemperature; // no casting
        double num6 = bodyTemperature;//imlicit, outomatic, widening
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    }
}
