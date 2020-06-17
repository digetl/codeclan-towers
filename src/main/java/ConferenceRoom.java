import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private boolean vcEnabled;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity, boolean vcEnabled) {
        this.name = name;
        this.capacity = capacity;
        this.vcEnabled = vcEnabled;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isVcEnabled() {
        return vcEnabled;
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
