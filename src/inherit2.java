//Simple program to understand the inheritance in java...
class Animal{           //It is a superclass...
    public void bark(){
        System.out.println("Animals...barks");
    }
    public void speak(){
        System.out.println("Animal speaks bow...meow......");
    }
}
class Dog extends Animal{           //it is a subclass...
    public void dbark(){
        System.out.println("Dogs...barks");
    }
    public void dspeak(){
        System.out.println("Dogs speaks bow...bow..bow");
    }
}
public class inherit2 {
    public static void main(String[] args) {
        Animal a = new Animal();//Instantiating the object for the superclass..
        a.bark();
        Dog d =new Dog();//Instantiating the object for the subclass..
        d.bark();
        d.dbark();
        d.speak();
        d.dspeak();
    }
}
/*
output:
Animals...barks
Animals...barks
Dogs...barks
Animal speaks bow...meow......
Dogs speaks bow...bow..bow
 */