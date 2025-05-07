public class Book {
    String Name, Author, isbn;
    boolean isAvailable;

    Book(String Name, String Author, String isbn, boolean isAvailable) {
        this.Name = Name;
        this.Author = Author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public void issueBook() {
        if (isAvailable) {
            System.out.println("Book issued successfully" + Name);
            isAvailable = false;
        } else {
            System.out.println("Book is not available for issue.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println("Book returned successfully" + Name);
            isAvailable = true;
        } else {
            System.out.println("Book was not issued.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true);
        System.out.println("Book 1 Details:");
        System.out.println("Name: " + book1.Name);
        System.out.println("Author: " + book1.Author);
        System.out.println("ISBN: " + book1.isbn);
        System.out.println("Available: " + book1.isAvailable);

        book1.issueBook();
        book1.returnBook();
    }
}
