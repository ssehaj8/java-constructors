class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "unknown Title";
        this.author = "unknown Author";
        this.price = 0.0;

    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Book book1 = new Book();
        book1.displayDetails();

        // Creating an object using the parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 800);
        book2.displayDetails();
    }
}