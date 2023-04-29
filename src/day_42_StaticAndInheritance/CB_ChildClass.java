package day_42_StaticAndInheritance;

public class CB_ChildClass extends CA_ParentClass {
    String meslek;
    public CB_ChildClass(String name,String meslek){
       super(name);//parent clasın argümanlı construckterını
        // zorunlu olarak supet keywordle çağırıyoruz
        //zorunlu olarak çağırmamak için mutlaka parent clasta boç construckter yapılmalı
        this.meslek=meslek;
    }
}
