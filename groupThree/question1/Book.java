/**
 * Represents a book with a title and availability status.
 */
import javax.swing.JOptionPane;


 class Book {
    private String title;
    private boolean available;

    /**
     * Constructs a Book object with the given title.
     *
     * @param title The title of the book.
     */

     Book(String title) {
        this.title = title;
        this.available = true; 
    }
    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Checks if the book is available for borrowing.
     *
     * @return True if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return available;
    }
    /**
     * Allows a user to borrow the book if it's available.
     * Displays a message indicating success or failure.
     */
    public void borrow() {
        if (available) {
            available = false;
            JOptionPane.showMessageDialog(null, "You have borrowed the book: " + title);
        } else 
        {
            JOptionPane.showMessageDialog( null, "Sorry, this book is currently not available.");
        }
    }
    /**
     * Marks the book as returned.
     * Displays a message indicating the return.
     */
    public void returnBook() {
        available = true;
        JOptionPane.showMessageDialog(null, "You have returned the book: ");
    }

}
