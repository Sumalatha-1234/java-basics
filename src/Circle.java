//Create a class square with a method to initialize its side,calculating area,perimeter....
import java.util.Scanner;
class Calculate{
    public void area(double radius){
        double area=radius*radius;
        System.out.println("The area of the circle  is:"+area);
    }
    public void circumference(double radius){
        double circumference=2*Math.PI*radius;
        System.out.println("The circumference of the circle is:"+circumference);
    }
}
public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        double radius=sc.nextDouble();
        Calculate cal=new Calculate();
        cal.area(radius);
        cal.circumference(radius);
    }
}
/*
output:
Enter the radius of the Circle:
20.2
The area of the circle  is:408.03999999999996
The circumference of the circle is:126.92034320502763
 */