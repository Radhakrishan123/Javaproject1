import java.util.Scanner;

public class BankingApplication {

    // Inner Class
    static class BankAccount {

        private String accountHolder;
        private int accountNumber;
        private double balance;

        // Constructor
        public BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Deposit Method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("₹" + amount + " deposited successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw Method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        // Balance Inquiry
        public void checkBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }

        // Display Account Details
        public void displayAccount() {
            System.out.println("\nAccount Holder : " + accountHolder);
            System.out.println("Account Number : " + accountNumber);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Radha Krishna", 123456789, 5000);

        int choice;
        double amount;

        do {
            System.out.println("\n====== BANKING APPLICATION ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.displayAccount();
                    account.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using our Banking Application.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}