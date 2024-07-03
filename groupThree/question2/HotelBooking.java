import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The HotelBooking class represents a hotel booking system.
 */
class HotelBooking {
      final private String hotelName;
      final private String location;
      private Client client;
      private  Room room;
      private int rating;

      private boolean availableRoom;

      Scanner input = new Scanner(System.in);
      List<Room> rooms;

      /**
       * Constructs a HotelBooking object with the specified hotel name, location, and rating.
       *
       * @param hotelName The name of the hotel.
       * @param location  The location of the hotel.
       * @param rating    The rating of the hotel.
       */
      HotelBooking(final String hotelName,
                   final String location,
                   final int rating)
      {
            this.hotelName = hotelName;
            this.location  = location;
            this.rating    = rating;
            rooms = new ArrayList<>();

      }
      /**
       * Adds a room to the list of rooms available in the hotel.
       *
       * @param room The room to be added.
       */
      public void addBook(Room room)
      {
            rooms.add(room);
      }
      /**
       * Prints the available rooms in the hotel.
       */
      public void printAvailableRoom()
      {
            System.out.println("Available room:");
            for(Room room : rooms)
            {
                  if(room.isAvailable())
                  {
                        System.out.println(room);
                  }
            }
      }
      /**
       * Prints the booked room based on the room type provided.
       *
       * @param roomBookType The type of room to be booked.
       */
      public void printBookedRoom(String roomBookType) {
            boolean roomBooked = false;
            for (Room room : rooms) {
                  if (room.getRoomType().equalsIgnoreCase(roomBookType)) {
                        roomBooked = true;
                        System.out.println( roomBookType + " "+"room booked");
                        room.setAvailable(false);
                  }
            }
            if (!roomBooked) {
                  System.out.println("Rooms available");
            }

      }
      /**
       * Collects client information and books a room based on user input.
       *
       * @return The Client object with booking details.
       */
      public Client clientCollectBooking()
      {
            final int userInput;
            Room bookedRoom;
            boolean found;

            found = false;
            bookedRoom = null;

            printAvailableRoom();
            System.out.print("Enter the room number for the room you want: ");
            userInput = input.nextInt();

            for(final Room room: rooms)
            {
                  if(room.getRoomNumber() == userInput)
                  {
                        found = true;
                        bookedRoom = room;
                        System.out.println("**Lets collect your information**");
                  }
            }
            if(found)
            {
                  System.out.print("Enter your first name: ");
                  String firstName = input.next();

                  System.out.print("Enter your last name: ");
                  String lastName = input.next();

                  System.out.print("Enter Phone Number: ");
                  String phoneNumber = input.next();

                  System.out.print("Enter the date you'll be checking in (day-month year): ");
                  String reservedDate = input.next();


                  System.out.println();

                  return new Client(firstName, lastName,phoneNumber, bookedRoom, reservedDate);
            }
            else
            {
                  System.out.println("Room not found.");
            }

            return null;
      }

      /**
       * Prints the receipt for the booked room.
       */
       public void receiptRoom()
      {
             Client clientDetails = clientCollectBooking();
             if(clientDetails != null)
             {
                   System.out.println("Your receipt ");
                   System.out.println("Room Number: " + clientDetails.getRoomBooked().getRoomNumber());
                   System.out.println("Room Type: " + clientDetails.getRoomBooked().getRoomType());
                   System.out.println("First Name: " + clientDetails.getFirstName());
                   System.out.println("Last Name: "+ clientDetails.getLastName());
                   System.out.println("Price: R" + clientDetails.getRoomBooked().getPrice());
                   System.out.println("Reservation Date: "+ clientDetails.getReservationDate());
             }
             else
             {
                   System.out.println("Selected room not available;");
             }
      }
}
