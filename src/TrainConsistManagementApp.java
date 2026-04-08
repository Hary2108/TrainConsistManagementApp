import java.util.Arrays;

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Example (can be sorted or unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Search key
        String searchKey = "BG205";

        // Ensure sorting before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Perform Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the consist.");
        }

        System.out.println("Program continues...");
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        // Handle empty array
        if (arr.length == 0) {
            return false;
        }

        while (low <= high) {

            int mid = (low + high) / 2;

            // Compare using compareTo()
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }

        return false; // Not found
    }
}