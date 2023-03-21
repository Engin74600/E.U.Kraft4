package day_03_EscapeChar_Veriables;

public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.println("delisin\b oğlum sen!");// önceki karakteri siler
        System.out.println("\tdelisin oğlum sen!");// sonrasını tab yapar
        System.out.println("delisin \noğlum sen!");// sonrasını alt satıra< alır
        System.out.println("delisin \n\noğlum sen!");// sonrasını alt satıra< alır
        System.out.println("delisin \roğlum sen!");// öncesini silerek,sonrasını satır başı yapar
        System.out.println("delisin \"oğlum\" sen!");// kelimeyi tırnak içersine alır
        System.out.println("delisin \'oğlum\' sen!");//kelimeyi tek tırnak içersine alır
        System.out.println("delisin \\oğlum sen!");//başına slaş koyar
        System.out.println("delisin \\oğlum\\ sen!");
        System.out.println("-------------------");

        System.out.println("Pazartesi\nSalı\nÇarşamba\nPerşembe\ncuma\n\nc.tesi\nPazar");
    }
}
