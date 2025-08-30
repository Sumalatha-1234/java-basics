//Create a Class Sphere and use getters and setters to set its radius and height....
class get{
    public double radius;

    public void setRadius(double r){
        this.radius=r;
    }

    public double getRadius(){
        return radius;
    }
}
public class Sphere {
    public static void main(String[] args) {
        get g = new get();
        g.setRadius(4.5);
        System.out.println("The radius of the sphere is:");
        System.out.println(g.getRadius());
    }
}
/*
output:
The radius of the sphere is:
4.5
 */