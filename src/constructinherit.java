//Simple program to understand the constructor in an inheritance....
class Base1{
    Base1(){
        System.out.println("I am the base class constructor..");
    }
    Base1(int x){
        super();
        System.out.println("I am the base class constructor with the value x:"+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("I am the derived class constructor... ");
    }
    Derived1(int x,int y){
        super();
        System.out.println("I am the derived class constructor with the value y:"+y);
    }
}
class childClass extends Derived1{
    childClass(){
        super(3,4);
        System.out.println("I am the childClass constructor...");
    }
    childClass(int x,int y,int z){
        super();
        System.out.println("I am the childClass constructor with value z:"+z);
    }
}
public class constructinherit {
    public static void main(String[] args) {
       // Base1 b1=new Base1(); //output:I am the base class constructor..
      //  Derived1 d1=new Derived1();//output:I am the base class constructor with the value x:0
                                          // I am the derived class constructor...
      //  childClass c=new childClass();//output:I am the base class constructor..
                                      // I am the derived class constructor with the value y:4
                                      //I am the childClass constructor...
        childClass c=new childClass(5,6,9);
        //output:I am the base class constructor with the value x:0
       // I am the derived class constructor...
        //I am the childClass constructor with value z:9
    }
}
