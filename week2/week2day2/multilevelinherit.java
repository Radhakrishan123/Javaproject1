
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

// Grandchild Class
class SportsBike extends Bike {
    String sportsBikeName;

    void getSportsBikeName(String name) {
        sportsBikeName = name;
    }

    void speed() {
        System.out.println(sportsBikeName + " is running at high speed.");
    }
}

// Main Class
public class multilevelinherit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SportsBike sb = new SportsBike();

        System.out.print("Enter Vehicle Name: ");
        sb.getVehicleName(sc.nextLine());

        System.out.print("Enter Bike Name: ");
        sb.getBikeName(sc.nextLine());

        System.out.print("Enter Sports Bike Name: ");
        sb.getSportsBikeName(sc.nextLine());

        System.out.println("\nOutput:");
        sb.start();   // From Vehicle
        sb.ride();    // From Bike
        sb.speed();   // From SportsBike

        sc.close();
    }
}
    

