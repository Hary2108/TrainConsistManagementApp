import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("Train Consist Management App");

        List<PassengerBogie> list = new ArrayList<>();

        try {
            // Valid bogies
            list.add(new PassengerBogie("Sleeper", 72));
            list.add(new PassengerBogie("AC Chair", 54));

            // Invalid bogie
            list.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : list) {
            System.out.println(b);
        }
    }
}