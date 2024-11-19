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
        if (direction.equals("N")){
            direction = "W";
        } else if (direction.equals("W")){
            direction = "S";
        }

        return "0:0:" + direction;
    }
}
