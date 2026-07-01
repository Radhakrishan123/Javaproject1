// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named EvenOdd
public class EvenOdd {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Store the entered number in the variable 'num'
        int num = sc.nextInt();

        // Check whether the number is divisible by 2
        // If the remainder is 0, the number is even
        if (num % 2 == 0) {

            // Print that the number is even
            System.out.println(num + " is Even");

        } else {

            // If the remainder is not 0, the number is odd
            System.out.println(num + " is Odd");
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}