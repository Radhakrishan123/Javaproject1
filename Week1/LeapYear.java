// Import the Scanner class so we can take input from the keyboard
import java.util.Scanner;

// Create a class named leapyearcheck
public class LeapYear {

    // The main method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter Year: ");

        // Store the entered year in the variable 'year'
        int year = sc.nextInt();

        // Check if the year is a leap year
        // A leap year is:
        // 1. Divisible by 400
        // OR
        // 2. Divisible by 4 but NOT divisible by 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

            // If the condition is true, print that the year is a leap year
            System.out.println(year + " is a Leap Year");

        } else {

            // If the condition is false, print that the year is not a leap year
            System.out.println(year + " is Not a Leap Year");
        }

        // End of the main method
    }

    // End of the class
}