public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment the total number of products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Tablet", 299.99);

        // Display product details for each product
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();

        // Display the total number of products created
        Product.displayTotalProducts();
    }
}
