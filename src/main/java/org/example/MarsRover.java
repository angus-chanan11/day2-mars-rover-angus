package org.example;

public class MarsRover {

    private Orientation direction;

    public MarsRover(){
        direction = new NorthOrientation();
    }

    public String showStatus() {
        return "0:0:" + direction.getDirection();
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            direction = direction.turnLeft();
        } else if (command.equals("R")) {
            direction = direction.turnRight();
        }

        return "0:0:" + direction.getDirection();
    }
}
