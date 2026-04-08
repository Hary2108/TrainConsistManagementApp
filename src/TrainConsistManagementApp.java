public class TrainConsistManagementApp{

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- Goods Bogie Model ----
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("====================================");

        // Safe case
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        cylindricalBogie.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        rectangularBogie.assignCargo("Petroleum");

        System.out.println();

        System.out.println("UC15 runtime handling completed...");
    }
}