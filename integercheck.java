// Import Scanner class to take input from the keyboard.
import java.util.Scanner;

// Create a class named integercheck.
public class integercheck {

    // Main method - Program execution starts from here.
    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);

        // Display a message asking the user to enter a number.
        System.out.print("Enter a number: ");

        // Read the integer entered by the user and store it in the variable 'num'.
        int num = sc.nextInt();

        // Check whether the entered number is greater than 0.
        if (num > 0) {

            // If the condition is true, print "Positive Number".
            System.out.println("Positive Number");
        }

        // If the first condition is false, check whether the number is less than 0.
        else if (num < 0) {

            // If the condition is true, print "Negative Number".
            System.out.println("Negative Number");
        }

        // If both conditions are false, the number must be zero.
        else {

            // Print "Number is Zero".
            System.out.println("Number is Zero");
        }

        // Close the Scanner object to free system resources.
        sc.close();
    }
}
