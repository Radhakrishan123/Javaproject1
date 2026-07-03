// Parent Class
class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Balance: Rupees " + balance);
    }
}

// Child Class
class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rupees" + amount + " Deposited.");
    }
}

// Main Class
public class BankingApplication {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount("Radha Krishan", 5900);

        account.checkBalance();
        account.deposit(2000);
        account.checkBalance();
    }
}