import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before() { bedroom = new Bedroom("27", 2, "double"); }

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

}
