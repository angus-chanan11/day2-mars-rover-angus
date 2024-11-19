import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();

        String report = rover.showStatus();

        assertEquals("0:0:N", report);
    }


}
