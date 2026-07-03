
    class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start.");
    }
}

public class methodoverriding {

    public static void main(String[] args) {

        Vehicle v = new Bike();   // Upcasting

        v.start();    // Calls Bike's overridden method
    }
}

