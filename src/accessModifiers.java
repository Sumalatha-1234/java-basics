//Simple java program to understand the access modifiers in java....
class MyEmployee{
    private int id;
    private String name;
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
public class accessModifiers {
    public static void main(String[] args) {
        MyEmployee harry=new MyEmployee();
        //harry.id=45;
        //harry.name="CodeWithHarry";-->throws error due to private access modifiers..
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
/*
CodeWithHarry
234
 */