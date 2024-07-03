class Room {
    final private String roomType;
    final private int roomNumber;
    final private int price;
    private boolean availableRoom = true;

    Room(final String roomType,
         final int roomNumber,
         final int price)
    {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.price = price;

    }

     public int getPrice() {
         return price;
     }

     public String getRoomType() {
         return roomType;
     }

     public int getRoomNumber() {
         return roomNumber;
     }

     public boolean isAvailable()
     {
         return availableRoom;
     }

     public void setAvailable(boolean available)
     {
         this.availableRoom = available;
     }

     public void printRoomDetails()
     {
        System.out.println(getRoomType()+getRoomNumber());
     }

     @Override
     public String toString()
     {
         return String.format("Room Type: %s\nRoom Number: %d\nPrice: R%d\n------------", roomType, roomNumber, price);
     }
}
