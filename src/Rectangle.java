//Create a class square with a method to initialize its side,calculating area,perimeter....
import java.util.Scanner;
class Calculate{
    public int area(int length,int width){
        int area=length*width;
        System.out.println("The area of the rectangle is:"+area);
        return area;
    }
    public int perimeter(int length,int width){
        int perimeter=2*(length+width);
        System.out.println("The perimeter of the rectangle is:"+perimeter);
        return perimeter;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width=sc.nextInt();
        Calculate cal=new Calculate();
        cal.area(length,width);
        cal.perimeter(length,width);
    }
}
/*
output:
Enter the length of the rectangle:
4
Enter the width of the rectangle:
8
The area of the rectangle is:32
The perimeter of the rectangle is:24
 */