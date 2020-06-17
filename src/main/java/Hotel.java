import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public DiningRoom getDiningRoomByName(String name) {
        return diningRooms.get(name);
    }

    public void checkIn(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkIn(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOut(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void checkOut(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }

    public Booking bookRoom(int nights, Bedroom bedroom) {
        if (nights > 0 && nights < 15) {
            return new Booking(nights, bedroom);
        }
        return null;
    }

    public ArrayList<Bedroom> getVacantRooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.countGuests() == 0) {
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }

}
