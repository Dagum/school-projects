/**
 * The Client class represents a client who booked a room in the hotel.
 */
class Client{

    /**
     * Constructs a Client object with the specified client details.
     *
     * @param firstName        The first name of the client.
     * @param lastName         The last name of the client.
     * @param clientPhoneNumber The phone number of the client.
     * @param roomBooked       The room booked by the client.
     * @param reservationDate  The date of reservation.
     */
        private final String firstName;
        private final String lastName;
        private final String clientPhoneNumber;
        private final Room roomBooked;
        private final String reservationDate;

    Client(final String firstName,
              final String lastName,
              final String clientPhoneNumber,
              final Room roomBooked,
           final String reservationDate)
       {
           this.firstName = firstName;
           this.lastName = lastName;
           this.clientPhoneNumber = clientPhoneNumber;
           this.reservationDate = reservationDate;
           this.roomBooked = roomBooked;
       }

    /**
     * Gets the room booked by the client.
     *
     * @return The room booked by the client.
     */
    public Room getRoomBooked()

    {
        return roomBooked;
    }
    /**
     * Gets the first name of the client.
     *
     * @return The first name of the client.
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * Gets the last name of the client.
     *
     * @return The last name of the client.
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * Gets the reservation date of the client.
     *
     * @return The reservation date of the client.
     */
    public String getReservationDate()
    {
        return reservationDate;
    }
    /**
     * Gets the phone number of the client.
     *
     * @return The phone number of the client.
     */
    public String getClientPhoneNumber()

     {
        return clientPhoneNumber;
     }
}
