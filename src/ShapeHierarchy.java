/*Create a program with three classes: Shape, Circle, and ColoredCircle.
Parent Class Shape:Instance variable: name (String).
Constructor: Takes name and initializes it using this.
Method: displayDetails() which prints "This is a " + this.name + ".".
Child Class Circle extends Shape:Instance variable: radius (double).
Constructor: Takes radius. Use super to call the parent Shape constructor with "Circle" as the name.
Initialize radius using this.
Method: calculateArea() which returns the area of the circle.
Grandchild Class ColoredCircle extends Circle:
Instance variable:color (String).
Constructor:Takes radius and color. Use super to call the parent
Circle constructor with the radius. Initialize color using this.
Method: displayDetails() (Override): Use super.displayDetails() to call the parent's method,
and then print the color.
*/
public class ShapeHierarchy {

    /**
     * Parent Class: Represents a generic shape with a name.
     */
    public static class Shape {
        // Instance variable to hold the name of the shape.
        String name;

        /**
         * Constructor for the Shape class.
         * @param name The name of the shape.
         */
        public Shape(String name) {
            this.name = name;
        }

        /**
         * Method to display the basic details of the shape.
         */
        public void displayDetails() {
            System.out.println("This is a " + this.name + ".");
        }
    }

    /**
     * Child Class: Represents a circle, inheriting from Shape.
     * It adds a radius and methods to calculate area.
     */
    public static class Circle extends Shape {
        // Instance variable to hold the radius of the circle.
        double radius;

        /**
         * Constructor for the Circle class.
         * Calls the parent (Shape) constructor with a fixed name.
         * @param radius The radius of the circle.
         */
        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        /**
         * Calculates and returns the area of the circle.
         * @return The area of the circle.
         */
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    /**
     * Grandchild Class: Represents a colored circle, inheriting from Circle.
     * It adds a color and overrides the displayDetails() method.
     */
    public static class ColoredCircle extends Circle {
        // Instance variable to hold the color of the circle.
        String color;

        /**
         * Constructor for the ColoredCircle class.
         * Calls the parent (Circle) constructor with the radius.
         * @param radius The radius of the circle.
         * @param color  The color of the circle.
         */
        public ColoredCircle(double radius, String color) {
            super(radius);
            this.color = color;
        }

        /**
         * Overridden method to display details.
         * It first calls the parent's displayDetails() and then adds its own details.
         */
        @Override
        public void displayDetails() {
            super.displayDetails(); // Calls the displayDetails method in the Circle class.
            System.out.println("The color is " + this.color + ".");
        }
    }

    /**
     * Main method to demonstrate the usage of the classes.
     */
    public static void main(String[] args) {
        // Create a new instance of ColoredCircle.
        ColoredCircle myCircle = new ColoredCircle(5.0, "Blue");

        System.out.println("--- Demonstrating ColoredCircle ---");
        // Call the overridden method. This will print details from both Circle and ColoredCircle.
        myCircle.displayDetails();

        System.out.println("--- Demonstrating inherited method ---");
        // Call the inherited calculateArea method.
        System.out.println("The area is: " + myCircle.calculateArea());
    }
}
/*
output:
--- Demonstrating ColoredCircle ---
This is a Circle.
The color is Blue.
--- Demonstrating inherited method ---
The area is: 78.53981633974483
 */
