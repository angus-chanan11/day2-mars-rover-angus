package org.example;

public class WestOrientation implements Orientation{
    @Override
    public Orientation turnLeft() {
        return new SouthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOrientation();
    }

    @Override
    public String getDirection() {
        return "W";
    }

    @Override
    public void moveForward(Coordinate coordinate) {
        coordinate.setX(coordinate.getX() - MOVE_STEP_SIZE);
    }

    @Override
    public void moveBackward(Coordinate coordinate) {
        coordinate.setX(coordinate.getX() + MOVE_BACKWARD_STEP_SIZE);
    }
}
