// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC16: Sort Passenger Bogies by Capacity (Bubble Sort) ===");

        // Example passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original Capacities: ");
        printArray(capacities);

        // Perform Bubble Sort
        bubbleSort(capacities);

        System.out.print("Sorted Capacities:   ");
        printArray(capacities);

        System.out.println("Program continues...");
    }

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}