import java.util.Scanner;

// Parent Class
class Vehicle {
    String vehicleName;

    void getVehicleName(String name) {
        vehicleName = name;
    }

    void start() {
        System.out.println(vehicleName + " is starting.");
    }
}

// Child Class
class Bike extends Vehicle {
    String bikeName;

    void getBikeName(String name) {
        bikeName = name;
    }

    void ride() {
        System.out.println(bikeName + " is running on the road.");
    }
}

// Main Class
public class SingleInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bike b = new Bike();

        System.out.print("Enter Vehicle Name: ");
        b.getVehicleName(sc.nextLine());

        System.out.print("Enter Bike Name: ");
        b.getBikeName(sc.nextLine());

        System.out.println("\nOutput:");
        b.start();   // Inherited method
        b.ride();    // Child class method

        sc.close();
    }
}