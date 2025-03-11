class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;


    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available by default
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned: " + title);
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book1.displayBookInfo();
        book1.borrowBook();
        book1.displayBookInfo();
        book1.returnBook();
        book1.displayBookInfo();
    }
}
