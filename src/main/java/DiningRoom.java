import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name) {
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int countGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        if (guests.contains(guest)) {
            guests.remove(guest);
        }
    }

}
