//Simple program to understand the concept of constructors in java...
class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=45;
        name="myName";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry=new MyMainEmployee();
       // harry.setId(234);
        System.out.println(harry.getId());
        //harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}
/*
output:
45
myName
 */