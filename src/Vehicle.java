/*Create a parent class named Vehicle and a child class named Car.
Parent Class Vehicle:
Instance variable: type (String).
Constructor: A constructor that takes a type string as a parameter and initializes
the type instance variable.
Method: A public method named startEngine() that prints a message like
"The vehicle's engine has started.".
Child Class Car:
Instance variable: model (String).
Constructor: A constructor that takes type and model as parameters.
Use the super keyword to call the parent class's constructor to initialize the type variable.
Then, initialize the model variable.
Method: Override the startEngine() method from the parent class. In the overridden method,
 first call the parent's startEngine() method using the super keyword,
 and then print a message specific to the Car class, such as "The car's engine is now running.".
main method: In a main method, create a Car object and call the overridden startEngine() method.
 */
 class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void startEngine() {
        System.out.println("The vehicle's engine has started...");
    }
}
    class Car extends Vehicle{
        String model;
       public Car(String type,String model){
            super(type);
           this. model=model;
        }
        @Override
        public void startEngine(){
            super.startEngine();
            System.out.println("the cars"+this.model+" engine is now running..");
        }

    public static void main(String[] args) {
        Car c = new Car("Sedan","Honda Civic");
        c.startEngine();
    }
}
/*
output:
The vehicle's engine has started...
the carsHonda Civic engine is now running..
 */