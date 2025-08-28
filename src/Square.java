//Create a class square with a method to initialize its side,calculating area,perimeter....
import java.util.Scanner;
class Calculate{
    public int area(int side){
        int area=side*side;
        System.out.println("The area of the square is:"+area);
        return area;
    }
    public int perimeter(int side){
        int perimeter=4*side;
        System.out.println("The perimeter of the square is:"+perimeter);
        return perimeter;
    }
}
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side value of the square:");
        int side=sc.nextInt();
        Calculate cal=new Calculate();
        cal.area(side);
        cal.perimeter(side);
    }
}
/*
output:
Enter the side value of the square:
8
The area of the square is:64
The perimeter of the square is:32
 */