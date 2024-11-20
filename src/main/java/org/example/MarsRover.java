package org.example;

public class MarsRover {

    public static final String SEPARATOR = ":";
    public static final int MOVE_STEP_SIZE = 1;
    private Orientation direction;
    private int yLocation;
    private int xLocation;

    public MarsRover(){
        direction = new NorthOrientation();
        yLocation = 0;
        xLocation = 0;
    }

    public String showStatus() {
        return xLocation + SEPARATOR + yLocation + SEPARATOR + direction.getDirection();
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            direction = direction.turnLeft();
        } else if (command.equals("R")) {
            direction = direction.turnRight();
        } else if (command.equals("M")) {
            if (direction instanceof NorthOrientation) {
                yLocation += MOVE_STEP_SIZE;
            } else if (direction instanceof SouthOrientation) {
                yLocation -= MOVE_STEP_SIZE;
            } else if (direction instanceof EastOrientation) {
                 xLocation += MOVE_STEP_SIZE;
            } else if (direction instanceof WestOrientation) {
                xLocation -= MOVE_STEP_SIZE;
            }
        } else if (command.equals("B")) {
            if (direction instanceof NorthOrientation) {
                yLocation -= 1;
            } else if (direction instanceof SouthOrientation) {
                yLocation += 1;
            }else if (direction instanceof EastOrientation) {
                xLocation -= 1;
            } else if (direction instanceof WestOrientation) {
                xLocation += 1;
            }
        }

        return showStatus();
    }

    public String executeCommands(String commands) {
        commands.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .forEach(this::executeCommand);
        return showStatus();
    }
}
