
import java.util.Scanner;
public class operator {
    
 // Import Scanner class to take input from the user



    public static void main(String[] args) {   // Main method - execution starts here

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.println("Enter value of a:");
        int a = sc.nextInt();   // Store the first input in variable 'a'

        // Ask the user to enter the second number
        System.out.println("Enter value of b:");
        int b = sc.nextInt();   // Store the second input in variable 'b'

        // Addition
        System.out.println("Addition = " + (a + b));

        // Subtraction
        System.out.println("Subtraction = " + (a - b));

        // Multiplication
        System.out.println("Multiplication = " + (a * b));

        // Division
        System.out.println("Division = " + (a / b));

        // Close the Scanner
        sc.close();
    }
}
