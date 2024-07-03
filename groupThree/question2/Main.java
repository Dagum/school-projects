import java.util.Scanner;
/**
 * The Main class is the entry point of the hotel booking system.
 */
class Main {
    /**
     * The main method where the program execution starts.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(final String[] args )
    {
        // Creating HotelBooking instances and adding rooms to them

        HotelBooking hotel1 = new HotelBooking("Gardens hotel ", "123 limpopo road", 3);
        hotel1.addBook(new Room("single", 4001, 1500));
        hotel1.addBook(new Room("double", 3002, 1800));
        hotel1.addBook(new Room("Presidential suites", 2003, 2900));
        hotel1.addBook(new Room("Suite", 1002, 4500));

        HotelBooking hotel2 = new HotelBooking("sideView Resort hotel", "456 Ocean Avenue", 4);
        hotel2.addBook(new Room("standard", 5001, 1200));
        hotel2.addBook(new Room("deluxe", 6002, 2000));
        hotel2.addBook(new Room("ocean view suite", 7003, 3500));
        hotel2.addBook(new Room("penthouse", 8004, 5000));

        // Prompting user to select a hotel

        Scanner input = new Scanner(System.in);
        System.out.println("Select a hotel:");
        System.out.println("1. Gardens hotel");
        System.out.println("2. sideView Resort hotel");
        int choice = input.nextInt();

        // Prompting user to select a hotel

        HotelBooking selectedHotel;
        if(choice == 1) {
            selectedHotel = hotel1;
        } else if(choice == 2) {
            selectedHotel = hotel2;
        } else {
            System.out.println("Invalid choice. Defaulting to Gardens hotel.");
            selectedHotel = hotel1;
        }

        // Printing the receipt for the selected hotel

        selectedHotel.receiptRoom();
    }
}
