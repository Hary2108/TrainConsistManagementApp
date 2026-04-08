import java.util.Arrays;

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search ===");

        // Case 1: Empty bogie list (will throw exception)
        String[] emptyBogieIds = {};

        // Case 2: Non-empty bogie list
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchKey = "BG205";

        // ---- Test Empty Case ----
        try {
            System.out.println("\nSearching in empty bogie list...");
            boolean result = searchBogie(emptyBogieIds, "BG101");
            System.out.println("Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ---- Test Valid Case ----
        try {
            System.out.println("\nSearching in available bogie list...");

            boolean result = searchBogie(bogieIds, searchKey);

            if (result) {
                System.out.println("Bogie ID " + searchKey + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] arr, String key) {

        // Fail-Fast Check
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Linear Search (after validation)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not found
    }
}