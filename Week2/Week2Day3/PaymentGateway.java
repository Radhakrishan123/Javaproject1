import java.util.Scanner;

// Interface
interface Payment {
    void pay(double amount);
}

// Abstract Class
abstract class Paymentgate {
    abstract void transactionStatus(boolean status);
}

// Child Class
class UPI extends Paymentgate implements Payment {

    boolean success;

    public void pay(double amount) {

        if (amount > 0 && amount <= 50000) {
            success = true;
            System.out.println("Payment Successful: ₹" + amount);
        } else {
            success = false;
            System.out.println("Payment Failed: ₹" + amount);
        }
    }

    void transactionStatus(boolean status) {

        if (status) {
            System.out.println("Transaction Completed");
        } else {
            System.out.println("Transaction Failed");
        }
    }
}

// Main Class
public class PaymentGateway {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        UPI upi = new UPI();

        upi.pay(amount);
        upi.transactionStatus(upi.success);

        sc.close();
    }
}