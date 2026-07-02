import java.util.Scanner;

class Bank {

    private String name;
    private int accNo;
    private double balance;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    int getAccNo() {
        return accNo;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }
}

class Deposit {

    void deposit(Bank b, double amount) {
        b.setBalance(b.getBalance() + amount);
        System.out.println("Deposit Successful");
    }
}

class Withdraw {

    void withdraw(Bank b, double amount) {

        if (amount <= b.getBalance()) {
            b.setBalance(b.getBalance() - amount);
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Name: ");
        b.setName(sc.nextLine());

        System.out.print("Enter Account Number: ");
        b.setAccNo(sc.nextInt());

        System.out.print("Enter Balance: ");
        b.setBalance(sc.nextDouble());

        Deposit d = new Deposit();
        Withdraw w = new Withdraw();

        System.out.print("Enter Deposit Amount: ");
        d.deposit(b, sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        w.withdraw(b, sc.nextDouble());

        System.out.println("\nAccount Holder : " + b.getName());
        System.out.println("Account Number : " + b.getAccNo());
        System.out.println("Current Balance: " + b.getBalance());

        sc.close();
    }
}