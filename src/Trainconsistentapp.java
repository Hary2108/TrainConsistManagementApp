import java.util.ArrayList;
import java.util.List;

// Bogie class (same as previous use cases)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create Bogie List
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // 🔥 Stream Aggregation (Total Capacity)
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}