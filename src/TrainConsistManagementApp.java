// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC15 ===");

        // Create bogies
        GoodsBogie rectangularBogie = new RectangularBogie("RB1");
        GoodsBogie cylindricalBogie = new CylindricalBogie("CB1");

        // Safe Assignment
        rectangularBogie.assignCargo("FoodGrains");

        // Unsafe Assignment (Petroleum to Rectangular)
        rectangularBogie.assignCargo("Petroleum");

        // Safe Assignment
        cylindricalBogie.assignCargo("Petroleum");

        // Program continues
        System.out.println("Application continues running safely...");
    }
}

// Abstract Goods Bogie Class
abstract class GoodsBogie {
    protected String bogieId;
    protected String cargo;

    public GoodsBogie(String bogieId) {
        this.bogieId = bogieId;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargoType) {
        try {
            validateCargo(cargoType);
            this.cargo = cargoType;
            System.out.println("Cargo '" + cargoType + "' assigned to bogie " + bogieId);
        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for bogie " + bogieId);
            System.out.println("--------------------------------------------");
        }
    }

    // Abstract validation method
    protected abstract void validateCargo(String cargoType);
}

// Rectangular Bogie
class RectangularBogie extends GoodsBogie {

    public RectangularBogie(String bogieId) {
        super(bogieId);
    }

    @Override
    protected void validateCargo(String cargoType) {
        if (cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException(
                    "Unsafe cargo! Petroleum cannot be loaded into a Rectangular Bogie."
            );
        }
    }
}
// Cylindrical Bogie
class CylindricalBogie extends GoodsBogie {

    public CylindricalBogie(String bogieId) {
        super(bogieId);
    }

    @Override
    protected void validateCargo(String cargoType) {
        // Cylindrical bogie allows petroleum (no restriction)
    }
}

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}