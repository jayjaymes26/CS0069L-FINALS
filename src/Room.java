public class Room
{
    private int roomID;
    private double rentAmount;

    public Room()
    {
        roomID = 0;
        rentAmount = 0.0;
    }

    public Room(int roomID, int tenantID, double rentAmount)
    {
        this.roomID = roomID;
        this.rentAmount = rentAmount;
    }

    // Setters
    public void setRoomID(int value)
    {
        roomID = value;
    }

    public void setRentAmount(double value)
    {
        assert value > 0: " Cannot input negative values";
        if(value > 0)
        {
            rentAmount = value;
        }
    }

    // Getters
    public int getRoomID()
    {
        return roomID;
    }

    public double getRentAmount()
    {
        return rentAmount;
    }
}
