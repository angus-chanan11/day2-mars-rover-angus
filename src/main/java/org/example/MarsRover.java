package org.example;

public class MarsRover {

    public static final String SEPARATOR = ":";
    private Orientation direction;
    private Coordinate coordinate;

    public MarsRover(){
        direction = new NorthOrientation();
        coordinate = new Coordinate(0, 0);
    }

    public String showStatus() {
        return String.format("%d%s%d%s%s", coordinate.getX(), SEPARATOR, coordinate.getY(), SEPARATOR, direction.getDirection());
    }

    public String executeCommand(String command) {
        Command convertedCommand = Command.commandFromString(command);
        if (convertedCommand.equals(Command.L)) {
            direction = direction.turnLeft();
        } else if (convertedCommand.equals(Command.R)) {
            direction = direction.turnRight();
        } else if (convertedCommand.equals(Command.M)) {
            direction.moveForward(coordinate);
        } else if (convertedCommand.equals(Command.B)) {
            direction.moveBackward(coordinate);
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
