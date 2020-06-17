import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        bedroom = new Bedroom("27", 2, "double");
        guest1 = new Guest("Iain");
        guest2 = new Guest("Gary");
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
}
