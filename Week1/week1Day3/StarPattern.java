// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Starpattern
public class StarPattern {

    // The main method is the entry point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");

        // Store the user's input in the variable 'rows'
        int rows = sc.nextInt();

        // Outer loop controls how many rows will be printed
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints stars in the current row
            // It prints stars equal to the value of i
            for (int j = 1; j <= i; j++) {

                // Print one star without moving to the next line
                System.out.print("*");
            }

            // After printing all stars in one row,
            // move the cursor to the next line
            System.out.println();
        }

        // Close the Scanner object to free memory
        sc.close();
    }
}