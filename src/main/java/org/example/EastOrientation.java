package org.example;

public class EastOrientation implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new NorthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOrientation();
    }

    @Override
    public String getDirection() {
        return "E";
    }

    @Override
    public void moveForward(Coordinate coordinate) {
        coordinate.setX(coordinate.getX() + MOVE_STEP_SIZE);
    }

    @Override
    public void moveBackward(Coordinate coordinate) {
        coordinate.setX(coordinate.getX() - MOVE_BACKWARD_STEP_SIZE);
    }
}
