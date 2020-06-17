import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private DiningRoom diningRoom1;
    private DiningRoom diningRoom2;
    private HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before() {
        bedroom1 = new Bedroom("1", 1, "single", 5);
        bedroom2 = new Bedroom("2", 2, "double", 10);
        bedroom3 = new Bedroom("Honeymoon Suite", 2, "suite", 50);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        conferenceRoom1 = new ConferenceRoom("The Macleod Suite", 100, false);
        conferenceRoom2 = new ConferenceRoom("The Campbell Suite", 200, true);
        conferenceRoom3 = new ConferenceRoom("The Hungary Suite", 300, true);
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        conferenceRooms.add(conferenceRoom3);
        diningRoom1 = new DiningRoom("Goulash Restaurant");
        diningRoom2 = new DiningRoom("Paprika Cafe");
        diningRooms = new HashMap<String, DiningRoom>();
        diningRooms.put(diningRoom1.getName(), diningRoom1);
        diningRooms.put(diningRoom2.getName(), diningRoom2);
        hotel = new Hotel("The Grand Budapest Hotel", bedrooms, conferenceRooms, diningRooms);
        guest1 = new Guest("Iain");
        guest2 = new Guest("Gary");
        guest3 = new Guest("Dave");
    }

    @Test
    public void hasName() {
        assertEquals("The Grand Budapest Hotel", hotel.getName());
    }

    @Test
    public void hasBedrooms() {
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void hasDiningRooms() {
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canGetDiningRoomByName__success() {
        assertEquals(diningRoom1, hotel.getDiningRoomByName("Goulash Restaurant"));
    }

    @Test
    public void canGetDiningRoomByName__failure() {
        assertNull(hotel.getDiningRoomByName("Fish Bistro"));
    }

    @Test
    public void canCheckInToBedroom() {
        hotel.checkIn(bedroom1, guest1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void canCheckInToConferenceRoom() {
        hotel.checkIn(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.countGuests());
    }

    @Test
    public void canCheckOutOfBedroom() {
        hotel.checkIn(bedroom2, guest1);
        hotel.checkIn(bedroom2, guest2);
        hotel.checkOut(bedroom2, guest1);
        assertEquals(1, bedroom2.countGuests());
    }

    @Test
    public void canCheckOutOfConferenceRoom() {
        hotel.checkIn(conferenceRoom1, guest1);
        hotel.checkIn(conferenceRoom1, guest2);
        hotel.checkOut(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.countGuests());
    }

    @Test
    public void canBookRoom() {
        Booking booking = hotel.bookRoom(5, bedroom2);
        assertEquals(5, booking.getNights());
        assertEquals(bedroom2, booking.getBedroom());
    }

    @Test
    public void cantBookRoomForLessThanOneNight() {
        Booking booking = hotel.bookRoom(0, bedroom1);
        assertNull(booking);
    }

    @Test
    public void cantBookRoomForMoreThan14Nights() {
        Booking booking = hotel.bookRoom(100, bedroom1);
        assertNull(booking);
    }

    @Test
    public void canGetVacantRooms() {
        hotel.checkIn(bedroom1, guest1);
        ArrayList<Bedroom> vacantRooms = hotel.getVacantRooms();
        assertEquals(2, vacantRooms.size());
    }

}
