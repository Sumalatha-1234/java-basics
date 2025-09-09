//Write a Java program to manage a shopping cart.
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("---------------------------");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] cart = new Product[4];
        double finalBill = 0;

        for (int i = 0; i < cart.length; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            cart[i] = new Product(id, name, price, qty);
        }

        System.out.println("\n=== Shopping Cart ===");
        for (Product p : cart) {
            p.displayProduct();
            finalBill += p.calculateTotalPrice();
        }

        System.out.println("Final Bill Amount = " + finalBill);

        sc.close();
    }
}
/*
output:
Enter details for Product 1
Enter Product ID: 23
Enter Product Name: Soap
Enter Price: 150
Enter Quantity: 2
Enter details for Product 2
Enter Product ID: 45
Enter Product Name: paste
Enter Price: 89
Enter Quantity: 4
Enter details for Product 3
Enter Product ID: 98
Enter Product Name: Toothbrush
Enter Price: 99
Enter Quantity: 1
Enter details for Product 4
Enter Product ID: 96
Enter Product Name: sweets
Enter Price: 120
Enter Quantity: 1

=== Shopping Cart ===
Product ID: 23
Product Name: Soap
Price: 150.0
Quantity: 2
Total Price: 300.0
---------------------------
Product ID: 45
Product Name: paste
Price: 89.0
Quantity: 4
Total Price: 356.0
---------------------------
Product ID: 98
Product Name: Toothbrush
Price: 99.0
Quantity: 1
Total Price: 99.0
---------------------------
Product ID: 96
Product Name: sweets
Price: 120.0
Quantity: 1
Total Price: 120.0
---------------------------
Final Bill Amount = 875.0
 */
