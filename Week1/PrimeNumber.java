// Import the Scanner class to take input from the keyboard
import java.util.Scanner;

// Create a class named Primenumcheck
public class PrimeNumber {

    // The main() method is the starting point of the Java program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Store the entered number in the variable 'num'
        int num = sc.nextInt();

        // Assume the number is prime initially
        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        // Numbers 0, 1, and negative numbers are not prime
        if (num <= 1) {
            isPrime = false;
        } else {

            // Check whether the number is divisible by any number
            // from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {

                // If the number is exactly divisible by i,
                // then it is not a prime number
                if (num % i == 0) {
                    isPrime = false;

                    // Stop checking further because we already know
                    // the number is not prime
                    break;
                }
            }
        }

        // Check the value of isPrime
        if (isPrime) {

            // If true, print that the number is prime
            System.out.println(num + " is a Prime Number");

        } else {

            // If false, print that the number is not prime
            System.out.println(num + " is Not a Prime Number");
        }

        // Close the Scanner object to free system resources
        sc.close();
    }
}