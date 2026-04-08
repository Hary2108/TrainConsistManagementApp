// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key (can be taken from user input if needed)
        String searchKey = "BG309";

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the consist.");
        }

        System.out.println("Program continues...");
    }

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        // Traverse array sequentially
        for (int i = 0; i < arr.length; i++) {

            // Compare using equals()
            if (arr[i].equals(key)) {
                return true; // Match found (early termination)
            }
        }

        return false; // No match found
    }
}