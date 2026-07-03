// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Reversepyramid
public class ReversePyramid {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");

        // Store the entered value in the variable 'n'
        int n = sc.nextInt();

        // Outer loop controls the total number of rows
        // It starts from row 1 and continues until row n
        for (int i = 1; i <= n; i++) {

            // Print spaces before the stars
            // The number of spaces increases by one in each row
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            // The number of stars decreases by two in each row
            // Formula: 2 × (n - i) + 1
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            // After printing one row,
            // move the cursor to the next line
            System.out.println();
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}