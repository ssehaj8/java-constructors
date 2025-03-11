public class Course {
    // Instance variables
    private String courseName;
    private int duration;  // Duration in weeks
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "ABC Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Java Programming", 12, 500.00);
        Course course2 = new Course("Web Development", 10, 450.00);
        Course course3 = new Course("Data Structures", 8, 400.00);

        // Display course details before updating institute name
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("XYZ University");

        // Display course details after updating institute name
        System.out.println("After updating the institute name:\n");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
