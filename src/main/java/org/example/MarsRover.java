package org.example;

public class MarsRover {

    private String direction;

    public MarsRover(){
        direction = "N";
    }

    public String showStatus() {
        return "0:0:" + direction;
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            if (direction.equals("N")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "E";
            } else if (direction.equals("E")) {
                direction = "N";
            }
        } else if (command.equals("R")) {
            if (direction.equals("N")) {
                direction = "E";
            } else if (direction.equals("E")){
                direction = "S";
            } else if (direction.equals("S")){
                direction = "W";
            } else if (direction.equals("W")){
                direction = "N";
            }
        }

        return "0:0:" + direction;
    }
}
