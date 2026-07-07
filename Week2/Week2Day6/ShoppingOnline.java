import java.util.Scanner;
import java.time.LocalDate;

class Product{
    int productId;
    String productName;
    double rateofProduct;
    Product(int productId, String productName,double rateofProduct, String customerName){
        this.productId = productId;
        this.productName = productName;

        this.rateofProduct = rateofProduct;
    }
    }

class OurShop extends Product{
    double Quantity;
    String customerName;
    OurShop(int productId, String productName, double rateofProduct, double Quantity, String customerName){
        super(productId, productName, rateofProduct, customerName);
        this.Quantity = Quantity;
        this.customerName = customerName;
    }
void displayShopDetails(){
    System.out.println("*------Shopping Details:------*");
    System.out.println("Product Id : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Rate of Product : "+rateofProduct);
        System.out.println("Quantity : "+Quantity);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Total Amount : "+(Quantity*rateofProduct));
        LocalDate currentDate = LocalDate.now();
        System.out.println("Date of Shopping : "+currentDate);
        System.out.println("Thank you for Shopping ");

    }

}
public class ShoppingOnline {
    public static void main(String[] args) {
        System.out.println("Welcome to Our Shop");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Id : ");
        int productId = sc.nextInt();
        System.out.print("Enter Product Name : ");
        String productName = sc.next();
        System.out.print("Enter Rate of Product : ");
        double rateofProduct = sc.nextDouble();
        System.out.print("Enter Quantity : ");
        double quantity = sc.nextDouble();
        System.out.print("Enter Customer Name : ");
        String customerName = sc.next();

        OurShop S =new OurShop(productId, productName, rateofProduct, quantity, customerName);
        
        S.displayShopDetails();
    }
}
