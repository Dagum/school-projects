
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Represents a library with an address and a collection of books.
 */
public class Library {
    String address;
    ArrayList<Book> books;

    /**
     * Constructs a Library object with the given address.
     *
     * @param address The address of the library.
     */

    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<>();
    }
    /**
     * Adds a book to the library's collection.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
    }
    /**
     * Prints the available books in the library.
     * Displays a message indicating the availability of each book.
     */
    public void printAvailableBooks() {
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No books available at the moment.");
        } else {
            StringBuilder sb = new StringBuilder("Available books at each Libraries:\n");
            for (Book book : books) {
                if (book.isAvailable()) {
                    sb.append(book.getTitle()).append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
    /**
     * Allows a user to borrow a book from the library.
     * Displays a message indicating success or failure.
     *
     * @param bookTitle The title of the book to borrow.
     */
    public void borrowBook(String bookTitle){
        boolean found = false;

        for(Book book : books){
            if (book.getTitle().equalsIgnoreCase(bookTitle)){
                book.borrow();
                found = true;
            } 
        }

        if(!found)
        {
            JOptionPane.showMessageDialog(null, "Sorry, the book " + bookTitle + " is not available");
        }
    }
    
    /**
     * Allows a user to return a book to the library.
     * Displays a message indicating the return.
     *
     * @param bookTitle The title of the book to return.
     */
    public void returnBook(String bookTitle){

        for (Book book : books){
            if ( book.getTitle().equalsIgnoreCase(bookTitle)){
                JOptionPane.showMessageDialog(null, "You have returned the book: " + bookTitle);
            } 
        }
    }
    
    
}
