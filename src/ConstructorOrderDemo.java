/*Create classes A, B, and C (where B extends A and C extends B).
Give each a constructor that prints a message.
Create an object of class C and observe the execution order of constructors.
 */
// Parent class
class A {
    public A() {
        System.out.println("Constructor of A called");
    }
}

// Child of A
class B extends A {
    public B() {
        System.out.println("Constructor of B called");
    }
}

// Child of B (grandchild of A)
class C extends B {
    public C() {
        System.out.println("Constructor of C called");
    }
}

// Main class
public class ConstructorOrderDemo {
    public static void main(String[] args) {
        // Create an object of C
        C obj = new C();
    }
}
/*
output:
Constructor of A called
Constructor of B called
Constructor of C called
 */