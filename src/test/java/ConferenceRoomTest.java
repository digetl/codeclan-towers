import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Macleod Suite", 100, true);
    }

    @Test
    public void hasConferenceRoomName() {
        assertEquals("The Macleod Suite", conferenceRoom.getName);
    }
}
