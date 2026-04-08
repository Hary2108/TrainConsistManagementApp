// Import required package
import java.util.Arrays;

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===");

        // Array of bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("Original Bogie Names: " + Arrays.toString(bogieNames));

        // Sort using built-in method
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("Sorted Bogie Names:   " + Arrays.toString(bogieNames));

        System.out.println("Program continues...");
    }
}