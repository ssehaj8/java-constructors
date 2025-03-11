public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 200.00;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Sehajpreet", "Car");
        Vehicle vehicle2 = new Vehicle("Sehaj", "Truck");
        Vehicle vehicle3 = new Vehicle("Sehajpreet Kaur", "Motorcycle");

        // Display vehicle details before updating registration fee
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(250.00);

        // Display vehicle details after updating registration fee
        System.out.println("After updating the registration fee:\n");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
    }
}
