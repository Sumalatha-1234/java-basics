//Simple java program to understand the inheritance concept...
class Base{
    public int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    public int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
public class inherit1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(78);
        System.out.println("I am the base class and I have set the X value now print it.." );
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setX(98);
        System.out.println("I am the derived class and I have set the X value now print it..");
        System.out.println(d.getX());
        d.setY(34);
        System.out.println("I am the derived class and I have set the Y value now print it..");
        System.out.println(d.getY());
    }
}
/*
output:
I am the base class and I have set the X value now print it..
78
I am the derived class and I have set the X value now print it..
98
I am the derived class and I have set the Y value now print it..
34
 */