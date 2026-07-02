import java.util.Scanner;

// Parent Class
class Vehicle {
    String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child Class 1
class Bike extends Vehicle {
    String model;

    void setModel(String model) {
        this.model = model;
    }

    void displayBike() {
        displayBrand();
        System.out.println("Bike Model: " + model);
    }
}

// Child Class 2
class Car extends Vehicle {
    String model;

    void setModel(String model) {
        this.model = model;
    }

    void displayCar() {
        displayBrand();
        System.out.println("Car Model: " + model);
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bike Object
        Bike bike = new Bike();
        System.out.print("Enter Bike Brand: ");
        bike.setBrand(sc.nextLine());

        System.out.print("Enter Bike Model: ");
        bike.setModel(sc.nextLine());

        System.out.println("\nBike Details");
        bike.displayBike();

        // Car Object
        Car car = new Car();
        System.out.print("\nEnter Car Brand: ");
        car.setBrand(sc.nextLine());

        System.out.print("Enter Car Model: ");
        car.setModel(sc.nextLine());

        System.out.println("\nCar Details");
        car.displayCar();

        sc.close();
    }
}