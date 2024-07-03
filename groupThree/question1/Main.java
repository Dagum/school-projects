import javax.swing.JOptionPane;
//import java.util.ArrayList;
/**
 * Represents the main class for interacting with libraries and books.
 */
public class Main {
    /**
     * Main method for running the library application.
     *
     * @param args Command-line arguments (not used).
     */

    public static void main(String[] args) {
        Library Mankweng = new Library("Mankweng Library");
        Library Turfloop = new Library("Turfloop Libray");

        // Add some books to Mankweng Library
        Mankweng.addBook(new Book("Java Programming"));
        Mankweng.addBook(new Book("Data Structures and Algorithms"));
        Mankweng.addBook(new Book("Introduction to Algorithms"));

        // Add some books to Turfloop Library
        Turfloop.addBook(new Book("Advanced Calculus"));
        Turfloop.addBook(new Book("Data Structures"));
        Turfloop.addBook(new Book("Compiler Theory"));


        // Menu for user interaction
        String menu = " Welcome to Mountain Cave Library\nRemeber that the operating hours are from 9am to 5pm!\n\n1. Print available books\n2. Borrow a book\n3. Return a book\n4. Exit";
       
        while (true)
         {
            // Prompt the user with a menu and store their choice.
            String choice = JOptionPane.showInputDialog( menu);

            if (choice.equals("1"))
            {
                Mankweng.printAvailableBooks();
                Turfloop.printAvailableBooks();

            }  else if (choice.equals("2"))
              {
               String whichLibrary = JOptionPane.showInputDialog( "Which library do you wanna borrow from? (Enter 0 for Mankweng Library and 1 for Turfloop Library)");

               if ( whichLibrary.equals("0"))
               {
                String titleToBorrow = JOptionPane.showInputDialog( "Which book do you want to borrow from Mankweng Library? ");
                Mankweng.borrowBook(titleToBorrow);

               } else if (whichLibrary.equals("1")) 
               {
                String titleToBorrow = JOptionPane.showInputDialog( "Which book do you want to borrow from Turfloop Library? ");
                Turfloop.borrowBook(titleToBorrow);
               } 
            // Break out of the loop after borrowing a book.   
               break;

            } 

            else if (choice.equals("3"))

            {
              // If the user chooses option 3, prompt them to select a library to return to,
              // then prompt for the title of the book they wish to return.

              String whichLibrary = JOptionPane.showInputDialog("Which library do you want to return from? (Enter 0 for Mankweng Library and 1 for Turfloop Library)");
              
              if (whichLibrary.equals("0")) 
              {
                String titleToReturn = JOptionPane.showInputDialog("Which book do you want to return from Mankweng Library? ");
                Mankweng.returnBook(titleToReturn);
              } 
            else if (whichLibrary.equals("1"))

              {
                String titleToReturn = JOptionPane.showInputDialog("Which book do you want to return?");
                Turfloop.returnBook(titleToReturn);
              }
                break;
            } else if (choice.equals("4")){
                break;
            }
    
        } 
    } 
}