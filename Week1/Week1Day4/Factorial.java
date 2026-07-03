// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Factorialprogram
public class Factorial {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Store the entered number in the variable 'num'
        int num = sc.nextInt();

        // Initialize the factorial variable with 1
        // We start with 1 because multiplying by 1 does not change the result
        int fact = 1;

        // Loop from 1 to the entered number
        // This loop multiplies all numbers from 1 to num
        for (int i = 1; i <= num; i++) {

            // Multiply the current factorial value by i
            // Store the result back in the variable 'fact'
            fact = fact * i;
        }

        // Print the final factorial value
        System.out.println("Factorial = " + fact);

        // Close the Scanner object to free system resources
        sc.close();
    }
}