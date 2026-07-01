// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Armstrongnumber
public class ArmstrongNumber {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Store the entered number in the variable 'num'
        int num = sc.nextInt();

        // Store the original number because 'num' will change during the loop
        int original = num;

        // Initialize the sum variable with 0
        int sum = 0;

        // Repeat the loop until the number becomes 0
        while (num > 0) {

            // Extract the last digit of the number
            int digit = num % 10;

            // Find the cube of the digit and add it to the sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit from the number
            num = num / 10;
        }

        // Check whether the calculated sum is equal to the original number
        if (sum == original)

            // If equal, print that it is an Armstrong number
            System.out.println(original + " is Armstrong Number");

        else

            // Otherwise, print that it is not an Armstrong number
            System.out.println(original + " is Not Armstrong Number");

        // Close the Scanner object to free system resources
        sc.close();
    }
}