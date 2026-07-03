// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Fibonacciseries
public class FibonacciSeries {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of terms
        System.out.print("Enter number of terms: ");

        // Store the entered number in the variable 'n'
        int n = sc.nextInt();

        // Initialize the first Fibonacci number
        int first = 0;

        // Initialize the second Fibonacci number
        int second = 1;

        // Print the heading
        System.out.print("Fibonacci Series: ");

        // Loop to print the Fibonacci series
        // The loop runs 'n' times
        for (int i = 1; i <= n; i++) {

            // Print the current Fibonacci number
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;

            // Move the second number to the first position
            first = second;

            // Move the next number to the second position
            second = next;
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}