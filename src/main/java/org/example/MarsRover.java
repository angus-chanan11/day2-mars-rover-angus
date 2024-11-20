package org.example;

public class MarsRover {

    public static final String SEPARATOR = ":";
    public static final int MOVE_STEP_SIZE = 1;
    public static final int MOVE_BACKWARD_STEP_SIZE = 1;
    private Orientation direction;
    private Coordinate coordinate;
    private int yLocation;
    private int xLocation;

    public MarsRover(){
        direction = new NorthOrientation();
        coordinate = new Coordinate(0, 0);
        yLocation = 0;
        xLocation = 0;
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
            if (direction instanceof NorthOrientation) {
                coordinate.setY(coordinate.getY() + MOVE_STEP_SIZE);
            } else if (direction instanceof SouthOrientation) {
                coordinate.setY(coordinate.getY() - MOVE_STEP_SIZE);
            } else if (direction instanceof EastOrientation) {
                coordinate.setX(coordinate.getX() + MOVE_STEP_SIZE);
            } else if (direction instanceof WestOrientation) {
                coordinate.setX(coordinate.getX() - MOVE_STEP_SIZE);
            }
        } else if (convertedCommand.equals(Command.B)) {
            if (direction instanceof NorthOrientation) {
                coordinate.setY(coordinate.getY() - MOVE_STEP_SIZE);
            } else if (direction instanceof SouthOrientation) {
                coordinate.setY(coordinate.getY() + MOVE_STEP_SIZE);
            } else if (direction instanceof EastOrientation) {
                coordinate.setX(coordinate.getX() - MOVE_STEP_SIZE);
            } else if (direction instanceof WestOrientation) {
                coordinate.setX(coordinate.getX() + MOVE_STEP_SIZE);
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
