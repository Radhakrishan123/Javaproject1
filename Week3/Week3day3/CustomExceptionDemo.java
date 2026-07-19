import java.util.Scanner;

class InvalidBalanceException extends Exception {

    public InvalidBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void checkBalance(int bal) throws InvalidBalanceException {

        if (bal < 500) {
            throw new InvalidBalanceException("Insufficient Balance");
        } else {
            System.out.println("Balance: " + bal);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        int bal = sc.nextInt();

        try {
            checkBalance(bal);
        } catch (InvalidBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}