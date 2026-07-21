// import java.util.Scanner;

// public class Balancecheck {

//     public static void main(String[] args) {

//         double balance = 1000;
//         double depositmoney;
//         double withrawmoney;

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter deposit money: ");
//         depositmoney = sc.nextDouble();

//         balance += depositmoney;
//         System.out.println("Updated Balance: " + balance);

//         System.out.print("Enter withdraw money: ");
//         withrawmoney = sc.nextDouble();

//         try {

//             if (withrawmoney > balance) {
//                 throw new Exception("Insufficient Balance");
//             }

//             balance -= withrawmoney;

//             System.out.println("Transaction Successful");
//             System.out.println("Available Balance: " + balance);

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;

public class InsufficientBalance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        try {
            if (balance < 500) {
                int x = 10 / 0;   //  ArithmeticException
            }

            System.out.println("Transaction Successful");
            System.out.println("Available Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        }
        finally{
            System.out.println("welcome to sbi bank ");
        }
        sc.close();
    }
}
