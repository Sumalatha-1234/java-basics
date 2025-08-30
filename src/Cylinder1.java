//Create a Class Cylinder and use getters and setters to set its radius and height....
class get{
    public double radius;
    public double height;

    public void setRadius(double r){
        this.radius=r;
    }
    public void setHeight(double h){
        this.height=h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}
public class Cylinder1 {
    public static void main(String[] args) {
        get g = new get();
        g.setRadius(9.8);
        System.out.println(g.getRadius());
        g.setHeight(3.1);
        System.out.println(g.getHeight());
    }
}
