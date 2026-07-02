class Product {

    private int productId;
    private String productName;
    private double price;

    // Setter Methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter Methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
public class Product2{
    public static void main(String[] args) {
        Product p2 = new Product();

        // Set values using Setter Methods
        p2.setProductId(152);
        p2.setProductName("Book");
        p2.setPrice(5000);

        // Get values using Getter Methods
        System.out.println("Product2 Details");
        System.out.println("Product ID   : " + p2.getProductId());
        System.out.println("Product Name : " + p2.getProductName());
        System.out.println("Price        : " + p2.getPrice());
    }
}

    

