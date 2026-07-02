class Product {

    int productId;
    String productName;
    double price;

    // Parameterized Constructor
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Display Method
    void display() {
        System.out.println("Product1 Details");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }
}
public class Product1 {

    public static void main(String[] args) {

        // Constructor called
        Product p1 = new Product(152, "book", 9000);

        // Display product details
        p1.display();
    }
}