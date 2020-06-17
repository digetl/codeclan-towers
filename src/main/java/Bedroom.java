import java.util.ArrayList;

public class Bedroom {
    private String name;
    private int capacity;
    private String type;
    private int rate;
    private ArrayList<Guest> guests;

    public Bedroom(String name, int capacity, String type, int rate) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getRate() {
        return rate;
    }

    public int countGuests() {
        return guests.size();
    }

    public boolean isFull() {
        return countGuests() == getCapacity();
    }

    public void addGuest(Guest guest) {
        if (!isFull()) {
            guests.add(guest);
        }
    }


    public void removeGuest(Guest guest) {
        if (guests.contains(guest)) {
            guests.remove(guest);
        }
    }
}
