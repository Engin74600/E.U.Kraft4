package day_42_StaticAndInheritance;

public class C01_Animal {
    private int Boyu;
    //private ile o özellik artık kalıtım/miras yapmaz
    boolean isTuylu;
    String name;

    public void yemekYe(){
        System.out.println(this.name+" yemek yiyor");
    }
}
