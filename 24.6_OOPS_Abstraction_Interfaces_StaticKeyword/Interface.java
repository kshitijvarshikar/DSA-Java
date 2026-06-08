// Interface
interface Vehicle {
    void start();   // abstract method
    void stop();    // abstract method
}

// Class implementing interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brake");
    }
}

// Another class implementing same interface
class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops with brake");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        // Interface reference (important concept)
        Vehicle v;

        v = new Car();   // Car object
        v.start();
        v.stop();

        System.out.println("------");

        v = new Bike();  // Bike object
        v.start();
        v.stop();
    }
}

// Note :-
// Interface : Interface in english is a point where two system meet and
// interact

// In Java Interace is a group of releted methods with empthy bodies

// Interface ka Object nhi ban skte hai, Interface Ka refrence ban skte hai