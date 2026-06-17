// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Pyramidpattern
public class Pyramidpattern {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");

        // Store the entered number in the variable 'n'
        int n = sc.nextInt();

        // Outer loop controls the number of rows in the pyramid
        for (int i = 1; i <= n; i++) {

            // Print spaces before the stars
            // The number of spaces decreases in each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            // The number of stars increases by 2 in each row
            // Formula: (2 × row number) - 1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // After printing one complete row,
            // move the cursor to the next line
            System.out.println();
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}
