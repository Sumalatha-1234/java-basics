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
    public double surfaceArea(){
        double surfaceArea=2*Math.PI*radius*(height+radius);
        return surfaceArea;
    }
    public double volume(){
        double volume=Math.PI*radius*radius*height;
        return volume;
    }
}
public class Cylinder2 {
    public static void main(String[] args) {
        get g = new get();
        g.setRadius(9.8);
        System.out.println("The radius of the cylinder is:");
        System.out.println(g.getRadius());
        g.setHeight(3.1);
        System.out.println("The height of the cylinder is:");
        System.out.println(g.getHeight());
        System.out.println("The surfaceArea of the cylinder is:");
        System.out.println(g.surfaceArea());
        System.out.println("The volume of the cylinder is:");
        System.out.println(g.volume());
    }
}
/*
output:
The radius of the cylinder is:
9.8
The height of the cylinder is:
3.1
The surfaceArea of the cylinder is:
794.3202865336434
The volume of the cylinder is:
935.3275311973678
 */