import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
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

}
