// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named LargestOfThree
public class LargestOfThree {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter first number: ");

        // Store the first number in variable 'a'
        int a = sc.nextInt();

        // Ask the user to enter the second number
        System.out.print("Enter second number: ");

        // Store the second number in variable 'b'
        int b = sc.nextInt();

        // Ask the user to enter the third number
        System.out.print("Enter third number: ");

        // Store the third number in variable 'c'
        int c = sc.nextInt();

        // Check if 'a' is greater than or equal to both 'b' and 'c'
        if (a >= b && a >= c) {

            // If true, print 'a' as the largest number
            System.out.println("Largest Number = " + a);

        }

        // Otherwise, check if 'b' is greater than or equal to both 'a' and 'c'
        else if (b >= a && b >= c) {

            // If true, print 'b' as the largest number
            System.out.println("Largest Number = " + b);

        }

        // If neither 'a' nor 'b' is the largest,
        // then 'c' must be the largest
        else {

            // Print 'c' as the largest number
            System.out.println("Largest Number = " + c);
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}