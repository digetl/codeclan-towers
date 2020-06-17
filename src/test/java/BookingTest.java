import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom("27", 2, "double", 20);
        booking = new Booking(5, bedroom);
    }

    @Test
    public void hasNights() {
        assertEquals(5, booking.getNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }
}
