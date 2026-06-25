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

// Child Class 1
class Bike extends Vehicle {
    String bikeName;

    void getBikeName(String name) {
        bikeName = name;
    }

    void ride() {
        System.out.println(bikeName + " is running on the road.");
    }
}

// Child Class 2
class Car extends Vehicle {
    String carName;

    void getCarName(String name) {
        carName = name;
    }

    void drive() {
        System.out.println(carName + " is driving on the road.");
    }
}

// Main Class
public class hierarchicalinherit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bike Object
        Bike b = new Bike();

        System.out.print("Enter Vehicle Name for Bike: ");
        b.getVehicleName(sc.nextLine());

        System.out.print("Enter Bike Name: ");
        b.getBikeName(sc.nextLine());

        // Car Object
        Car c = new Car();

        System.out.print("Enter Vehicle Name for Car: ");
        c.getVehicleName(sc.nextLine());

        System.out.print("Enter Car Name: ");
        c.getCarName(sc.nextLine());

        System.out.println("\n Bike Details ");
        b.start();
        b.ride();

        System.out.println("\n Car Details ");
        c.start();
        c.drive();

        sc.close();
    }
}

    

