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
        direction = "W";

        return "0:0:" + direction;
    }
}
