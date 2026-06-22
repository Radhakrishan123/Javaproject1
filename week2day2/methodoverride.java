import java.util.Scanner;

public class methodoverride {

    // Parent Class
    static class Vehicle {
        void start() {
            System.out.println("Vehicle Started");
        }
    }

    // Child Class
    static class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike Started");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bike b = new Bike();

        System.out.print("Enter Bike Name: ");
        String bikeName = sc.nextLine();

        System.out.println("Bike Name: " + bikeName);

        b.start();   // Calls overridden method

        sc.close();
    }
}