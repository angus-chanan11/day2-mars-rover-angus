package org.example;

public class SouthOrientation implements Orientation{
    @Override
    public Orientation turnLeft() {
        return new EastOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new WestOrientation();
    }

    @Override
    public String getDirection() {
        return "S";
    }

    @Override
    public void moveForward(Coordinate coordinate) {
        coordinate.setY(coordinate.getY() - MOVE_STEP_SIZE);
    }

    @Override
    public void moveBackward(Coordinate coordinate) {
        coordinate.setY(coordinate.getY() + MOVE_BACKWARD_STEP_SIZE);
    }
}
