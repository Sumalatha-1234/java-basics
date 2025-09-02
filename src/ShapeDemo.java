/*Create a Shape class with a parameterized constructor (e.g., name of shape).
Create Rectangle and Square subclasses that call the Shape constructor
and add their own dimensions.
 */
// Parent class
class Shape {
    String name;

    // Parameterized constructor
    public Shape(String name) {
        this.name = name;
        System.out.println("Shape constructor called for: " + name);
    }
}

// Rectangle extends Shape
class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        super("Rectangle"); // Call parent constructor
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area());
    }
}

// Square extends Shape
class Square extends Shape {
    int side;

    public Square(int side) {
        super("Square"); // Call parent constructor
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public void display() {
        System.out.println("Side: " + side);
        System.out.println("Area of Square: " + area());
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.display();

        System.out.println("--------------------");

        Square sq = new Square(6);
        sq.display();
    }
}
/*
output:
Shape constructor called for: Rectangle
Length: 10, Breadth: 5
Area of Rectangle: 50
--------------------
Shape constructor called for: Square
Side: 6
Area of Square: 36
 */
