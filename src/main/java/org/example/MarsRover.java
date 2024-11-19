package org.example;

public class MarsRover {

    private Orientation direction;
    private int yLocation;

    public MarsRover(){
        direction = new NorthOrientation();
        yLocation = 0;
    }

    public String showStatus() {
        return "0:" + yLocation + ":" + direction.getDirection();
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            direction = direction.turnLeft();
        } else if (command.equals("R")) {
            direction = direction.turnRight();
        } else if (command.equals("M")) {
            if (direction instanceof NorthOrientation) {
                yLocation += 1;
            } else if (direction instanceof SouthOrientation) {
                yLocation -= 1;
            }
        }

        return "0:" + yLocation + ":" + direction.getDirection();
    }
}
