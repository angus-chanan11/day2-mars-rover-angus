package org.example;

public class NorthOrientation implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new WestOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new EastOrientation();
    }

    @Override
    public String getDirection() {
        return "N";
    }

    @Override
    public void moveForward(Coordinate coordinate) {
        coordinate.setY(coordinate.getY() + MOVE_STEP_SIZE);
    }

    @Override
    public void moveBackward(Coordinate coordinate) {
        coordinate.setY(coordinate.getY() - MOVE_BACKWARD_STEP_SIZE);
    }
}
