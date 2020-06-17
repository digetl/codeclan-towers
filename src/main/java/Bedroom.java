import java.util.ArrayList;

public class Bedroom {
    private String name;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(String roomName, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int countGuests() {
        return guests.size();
    }
}
