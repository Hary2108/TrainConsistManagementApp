import java.util.ArrayList;
import java.util.List;

public class Trainconsistentapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state of the list
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);
    }
}