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
    public get(double r,double h){
       radius=9.8;
       height=3.1;
    }
}
public class Cylinder3 {
    public static void main(String[] args) {
        get g = new get(8.9,3.5);
        System.out.println("The radius of the cylinder is:");
        System.out.println(g.getRadius());
        System.out.println("The height of the cylinder is:");
        System.out.println(g.getHeight());
    }
}
/*
output:
The radius of the cylinder is:
9.8
The height of the cylinder is:
3.1
 */