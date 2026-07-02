import java.util.Scanner;
 class Bank {
    private String name;
    private int accountNumber;
    private double balance;

    public Bank(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    void setbalance(double balance){
        this.balance = balance;
    }
}
class Deposit{
    public Deposit(Bank Account  , double amount) {
        Account.setbalance(Account.getBalance() + amount);
        System.out.println("Money deposited");

    }
}
class withdraw{
    withdraw(Bank Account , double amount){
        if (Account.getBalance() >= amount) {
            Account.setbalance(Account.getBalance() - amount);
            System.out.println("Money withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Bank account = new Bank(name, accountNumber, balance);

        System.out.println("\nAccount Details");
        System.out.println("Account Holder Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        new Deposit(account, depositAmount);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        new withdraw(account, withdrawAmount);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
