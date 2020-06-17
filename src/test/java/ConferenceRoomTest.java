import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Macleod Suite", 100, true);
    }

    @Test
    public void hasConferenceRoomName() {
        assertEquals("The Macleod Suite", conferenceRoom.getName());
    }

    @Test
    public void getCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void isVCEnabled() {
        assertTrue(conferenceRoom.isVcEnabled());
    }

    @Test
    public void conferenceRoomStartEmpty() {
        assertEquals(0, conferenceRoom.countGuests());
    }

}
