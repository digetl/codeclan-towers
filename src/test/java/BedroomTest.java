import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        bedroom = new Bedroom("27", 2, "double");
        guest1 = new Guest("Iain");
        guest2 = new Guest("Gary");
        guest3 = new Guest("Dave");
    }

    @Test
    public void hasName() {
        assertEquals("27", bedroom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void bedroomStartsEmpty() {
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canCheckIfFull__true() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertTrue(bedroom.isFull());
    }

    @Test
    public void canCheckIfFull__false() {
        bedroom.addGuest(guest1);
        assertFalse(bedroom.isFull());
    }

    @Test
    public void cantAddGuestIfRoomFull() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest2);
        assertEquals(1, bedroom.countGuests());

    }

}
