package my_litte_notbook;

public class EscapeCharacters_Day03 {
    public static void main(String[] args) {
        System.out.println("delisin\b oğlum sen!");// önceki harfi siler
        System.out.println("\tdelisin oğlum sen!");// sonrasını tab yapar
        System.out.println("delisin \noğlum sen!");// sonrasını alt satıra< alır
        System.out.println("delisin \n\noğlum sen!");// tekrarı ile boş satır oluşur
        System.out.println("delisin \roğlum sen!");// öncesini silerek sonrasını satır başına çeker
        System.out.println("delisin \"oğlum\" sen!");// kelimeyi tırnak içersine alır
        System.out.println("delisin \'oğlum\' sen!");//kelimeyi tek tırnak içersine alır
        System.out.println("delisin \\oğlum sen!");//başına slaş koyar
        System.out.println("delisin \\oğlum\\ sen!");


    }
}
