// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named NumberTriangle
public class NumberTriangle {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");

        // Store the entered value in the variable 'n'
        int n = sc.nextInt();

        // Outer loop controls the number of rows
        // It starts from row 1 and continues until row n
        for (int i = 1; i <= n; i++) {

            // Inner loop prints numbers in each row
            // It starts from 1 and prints up to the current row number
            for (int j = 1; j <= i; j++) {

                // Print the value of j without moving to the next line
                System.out.print(j);
            }

            // After printing one complete row,
            // move the cursor to the next line
            System.out.println();
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}