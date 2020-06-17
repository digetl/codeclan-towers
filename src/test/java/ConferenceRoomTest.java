import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Macleod Suite", 2, true);
        guest1 = new Guest("Iain");
        guest2 = new Guest("Gary");
        guest3 = new Guest("Dave");
    }

    @Test
    public void hasConferenceRoomName() {
        assertEquals("The Macleod Suite", conferenceRoom.getName());
    }

    @Test
    public void getCapacity() {
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void isVCEnabled() {
        assertTrue(conferenceRoom.isVcEnabled());
    }

    @Test
    public void conferenceRoomStartEmpty() {
        assertEquals(0, conferenceRoom.countGuests());
    }

    @Test
    public void canCheckIfFull__true() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        assertTrue(conferenceRoom.isFull());
    }

    @Test
    public void canCheckIfFull__false() {
        conferenceRoom.addGuest(guest1);
        assertFalse(conferenceRoom.isFull());
    }

    @Test
    public void cantAddGuestIfRoomFull() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest2);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void cantRemoveGuestIfNotInRoom() {
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.countGuests());
    }

}
