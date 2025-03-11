public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Constructor to initialize car rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Getters and setters (optional, for accessing and modifying attributes)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create a CarRental object
        CarRental rental = new CarRental("Sehaj", "Volkswagen Virtus ", 5, 4000.00);

        // Display rental details
        rental.displayRentalDetails();
    }
}
