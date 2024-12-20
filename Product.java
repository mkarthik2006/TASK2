//Product class (pid,price,quantity)
import java.util.Scanner;
class Product {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Accept five product information from the user and store in an array
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter product ID, price, and quantity for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // b. Find the PID of the product with the highest price
        int highestPricePid = 0;
        double highestPrice = products[0].getPrice();
        for (int i = 1; i < 5; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                highestPricePid = products[i].getPid();
            }
        }
        System.out.println("Product with the highest price: " + highestPricePid);

        // c. Calculate and return the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        scanner.close();
    }

    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}