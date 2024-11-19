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

    @Test
    public void should_face_west_when_orient_north_and_turn_left() {
        MarsRover rover = new MarsRover();

        String response = rover.executeCommand("L");
        String report = rover.showStatus();

        assertEquals("0:0:W", response);
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");

        String response = rover.executeCommand("L");
        String report = rover.showStatus();

        assertEquals("0:0:S", response);
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");

        String response = rover.executeCommand("L");
        String report = rover.showStatus();

        assertEquals("0:0:E", response);
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        rover.executeCommand("L");

        String response = rover.executeCommand("L");
        String report = rover.showStatus();

        assertEquals("0:0:N", response);
        assertEquals("0:0:N", report);
    }
}
