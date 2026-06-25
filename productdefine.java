

public class productdefine {

    private int productId;
    private String productName;
    private double price;

    // Default Constructor
    public productdefine() {

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

    // Display Method
    public void display() {
        System.out.println("\n- Product Details -");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }

    public static void main(String[] args) {

        productdefine p = new productdefine();

        p.setProductId(898);
        p.setProductName("bike");
        p.setPrice(99990);

        System.out.println("Product ID : " + p.getProductId());
        System.out.println("Product Name : " + p.getProductName());
        System.out.println("Product Price : " + p.getPrice());

        p.display();
    }
}
