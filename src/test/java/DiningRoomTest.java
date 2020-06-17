import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Goulash Restaurant");
        guest1 = new Guest("Iain");
        guest2 = new Guest("Gary");
    }

    @Test
    public void hasDiningRoomName() {
        assertEquals("Goulash Restaurant", diningRoom.getName());
    }

    @Test
    public void diningRoomStartsEmpty() {
        assertEquals(0, diningRoom.countGuests());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.removeGuest(guest2);
        assertEquals(1, diningRoom.countGuests());
    }

    @Test
    public void cantRemoveGuestIfNotInRoom() {
        diningRoom.removeGuest(guest1);
        assertEquals(0, diningRoom.countGuests());
    }

}
